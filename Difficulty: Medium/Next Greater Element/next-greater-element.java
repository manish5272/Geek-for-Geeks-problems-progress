class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        
        for(int i=arr.length-1;i>=0;i--){
            
            while(!st.isEmpty() && st.peek() <= arr[i]){
                    st.pop();
                }
            
            
            if(st.empty()){
                list.add(-1);
                st.push(arr[i]);
            }
        
            
            else{
                list.add(st.peek());
                st.push(arr[i]);
                }
                
            }
        Collections.reverse(list);
        return list;
    }
}
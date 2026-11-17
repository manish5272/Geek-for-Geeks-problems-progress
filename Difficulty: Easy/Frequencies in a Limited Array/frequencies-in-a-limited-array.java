class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        ArrayList<Integer> list =  new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
                    list.add(0);
                }
        
        for(int i=0;i<arr.length;i++){
           
        
            if(arr[i] <= arr.length && arr[i] >= 0){
                int value = list.get(arr[i]-1)+1;
                list.set(arr[i]-1,value);
            }
        }
        return list;
    }
}

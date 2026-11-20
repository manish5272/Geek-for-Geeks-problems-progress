class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>(arr.length);
        Arrays.sort(arr);
        int count = 1;
        
        for(int i=1;i<arr.length;i++){
            
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                
                if(count > 1){
                    list.add(arr[i-1]);
                }
                count=1;
                
            }
        }
        if(count > 1){
                list.add(arr[arr.length-1]);
            }
        return list;
        
    }
}
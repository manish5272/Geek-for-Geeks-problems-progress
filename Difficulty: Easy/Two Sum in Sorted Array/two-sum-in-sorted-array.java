class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int i=0;
        int j=arr.length-1;
        
        while(i<j){
            
            int sum=arr[i]+arr[j];
            
            if(sum == target){
                
                list.add(i+1);
                list.add(j+1);
                break;
            }
            else if(sum > target){
                j--;
            }
            else{
                i++;
            }
            
        }
        
        if(list.isEmpty()){
            list.add(-1);
            list.add(-1);
        }
        
        return list;
    }
}
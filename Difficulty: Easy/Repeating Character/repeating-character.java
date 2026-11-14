class Solution {
    static int repeatedCharacter(String S) {
        
        
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            
            
            String temp = S.substring(i+1);
            
            if(temp.indexOf(ch)!=-1){
                return i;
            }
        }
        return -1;
    }
}
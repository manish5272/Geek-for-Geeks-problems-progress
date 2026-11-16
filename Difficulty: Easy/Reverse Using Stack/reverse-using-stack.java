class Solution {
    public String reverse(String S) {
        // code here
        if(S.length() <= 1){
            return S;
        }
        Stack<Character> St = new Stack<>();
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            
            St.push(ch);
        }
        S="";
        while(!St.isEmpty()){
            S=S+St.pop();
        }
        
        return S;
    }
}
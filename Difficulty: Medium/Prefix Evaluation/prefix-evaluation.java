class Solution {
    public int evaluatePrefix(String[] arr) {
        // code here
        
        Stack<Integer> st = new Stack<>();
        
        int res =0;
        
        for(int i=arr.length-1;i>=0;i--){
            String s = arr[i];
            
            
            if(s.equals("+") || s.equals("-") ||  s.equals("/") || s.equals("*") || 
            s.equals("^")){
                
                int a= st.pop();
                int b= st.pop();
                
                switch(s){
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                        res = a*b;
                        break;
                    case "/":
                        res = (int)Math.floor((double)a/b);
                       break;
                    case "^":
                        res = (int)Math.pow(a,b);
                        break;
                }
                
                st.push(res);
            }
            
            else{
                st.push(Integer.parseInt(s));
            }
            
            
        }
        
        int ans = st.pop();
        
        if(!st.isEmpty()){
            return -1;
        }
        
        return ans;
    }
}
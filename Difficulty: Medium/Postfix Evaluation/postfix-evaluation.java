class Solution {
    public int evaluatePostfix(String[] arr) {
        
        Stack<Integer> st= new Stack<>();
        int res=0 ;
        
        for(int i=0;i<arr.length;i++){
            
            
            String s = arr[i];
            
            
            

            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^")){
                int a = st.pop();
                int b = st.pop();
                
                char ch = s.charAt(0);
                 
                switch(ch){
                    case '+':
                        res = b + a;
                        st.push(res);
                        break;
                    case '-':
                        res = b - a;
                        st.push(res);
                        break;
                    case '*':
                        res = b * a;
                        st.push(res);
                        break;
                    case '/':
                        int result = (int)Math.floor((double)b / a);

                        st.push(result);
                        break;
                    case '^':
                        res = (int)Math.pow(b,a);
                        st.push(res);
                        break;
                            
                }
                
            }
            else{
                st.push(Integer.parseInt(s));
                }
                
            }
        
        int ans = st.peek();
        return ans;
        
    }
}
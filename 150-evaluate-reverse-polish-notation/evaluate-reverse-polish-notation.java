class Solution {
    public int evalRPN(String[] tokens) {
        int ans=0;
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            if(s.matches("^[+-]?\\d+(\\.\\d+)?$")){
                st.push(Integer.parseInt(s));

            }
            else{
              
                int b=st.pop();
                int a=st.pop();
                if(s.charAt(0)=='+'){
                    st.push(a+b);
                }
                else if(s.charAt(0)=='-'){
                    st.push(a-b);

                }
                else if(s.charAt(0)=='*'){
                    st.push(a*b);

                }
                else st.push(a/b);
            }
              //System.out.println(st);
        }
        return st.peek();
    }
}
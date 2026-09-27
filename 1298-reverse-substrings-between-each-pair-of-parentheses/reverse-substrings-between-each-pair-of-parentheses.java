class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c!=')') st.push(c+"");
            else{
                // StringBuilder sb=new StringBuilder();
                String sb="";
                while(!st.peek().equals("(")){
                    // sb.append(st.pop());

                    sb+=new StringBuilder(st.pop()).reverse().toString();
                }
                st.pop();
                st.push(sb);
            }
        }
        String rs="";
        while(!st.isEmpty()){
            rs=st.pop()+rs;
        }
        return rs;
    }
}
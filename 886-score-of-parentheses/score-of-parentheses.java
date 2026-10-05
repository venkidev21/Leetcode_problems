class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();

        for(char c: s.toCharArray()){
            if(c=='(') st.push(-1);
            else {
                if(st.peek()==-1){
                    st.pop();
                    st.push(1);
                } 
                else{
                    int rs=0;
                    while(st.peek()!=-1){
                        rs+=st.pop();
                    }
                    st.pop();
                    st.push(rs*2);
                }
            }
            //System.out.println(st);
        }

        int rs=0;
        while(!st.isEmpty()){
            rs+=st.pop();
        }
        return rs;
    }

}
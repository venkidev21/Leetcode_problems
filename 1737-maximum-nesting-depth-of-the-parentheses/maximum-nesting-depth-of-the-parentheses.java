class Solution {
    public int maxDepth(String s) {
        int ans=0;
        Stack<Character> st=new Stack<>();
        int op=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(c);
                op++;
            }
            else if(c==')'){
                st.pop();
                op--;
            }
            ans=Math.max(ans,op);
        }
        return ans;
    }
}
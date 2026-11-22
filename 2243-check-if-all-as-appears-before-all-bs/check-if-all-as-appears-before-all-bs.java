class Solution {
    public boolean checkString(String s) {
        Stack<Character> st=new Stack<>();

        for(char c:s.toCharArray()){
            if(st.isEmpty()) {
                st.push(c);
                continue;
            }

            if(st.peek()=='b' && c=='a') return false;
            st.push(c);
        }

        return true;
    }
}
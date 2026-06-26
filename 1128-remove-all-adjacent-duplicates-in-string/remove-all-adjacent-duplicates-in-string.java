class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(st.isEmpty()) st.push(c);
            else if(st.peek()==c) {
                while(!st.isEmpty() && st.peek()==c){
                    st.pop();
                }
                
            }
            else st.push(c);

        }
        String rs="";
        while(!st.isEmpty()){
            rs=st.pop()+rs;
        }
        return rs;
    }
}
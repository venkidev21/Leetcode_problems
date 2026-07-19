class Solution {
    public String smallestSubsequence(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
        }
        boolean visite[]=new boolean[26];
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(visite[c-'a']) continue;

            while(!st.isEmpty() && arr[st.peek()-'a']>i && st.peek()>c){
               visite[ st.pop()-'a']=false;

            }
            visite[st.push(c)-'a']=true;
        }
        String str="";
        while(!st.isEmpty()){
            str=st.pop()+str;
        }
        return str;
    }
}
class Solution {
    public int minSteps(String s, String t) {
        int frq[]=new int[26];
        // int tarr[]=new int[26];
        for(char c:s.toCharArray()){
            frq[c-'a']++;
        }
        for(char c:t.toCharArray()){
            frq[c-'a']--;
        }
        int res=0;
        for(int i=0;i<26;i++){
            if(frq[i]>0) res+=frq[i];
        }
        return res;
    }
}
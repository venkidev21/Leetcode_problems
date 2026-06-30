class Solution {
    public int numberOfSubstrings(String s) {
       int n=s.length();
       int l=0;
       int r=0;
       int frq[]=new int[3];
       int ans=0;
       while(r<n){
        char cur=s.charAt(r);
        frq[cur-'a']++;
        while(frq[1]>0 && frq[0]>0 && frq[2]>0){
            ans+=n-r;
            frq[s.charAt(l)-'a']--;
            l++;
        }
        r++;
       }
       return ans;
    }
}
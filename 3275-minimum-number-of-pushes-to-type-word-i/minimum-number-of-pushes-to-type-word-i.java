class Solution {
    public int minimumPushes(String word) {
       int i=1;
       int ans=0;
       int n=word.length();
       while(n>=8){
        n-=8;
        ans+=(8*i);
        i++;
       }
       ans+=(n*i);
       return ans;
    }
}
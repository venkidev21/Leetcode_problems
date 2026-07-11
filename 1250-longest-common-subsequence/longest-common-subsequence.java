class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()+1][text2.length()+1];
        int m=text2.length();
        int n=text1.length();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                 if(text1.charAt(i-1)==text2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                 else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);

            }
        }
        return dp[n][m];
        // return rec(text1.length()-1,text2.length()-1,text1,text2,arr);

    }
    // int rec(int i, int j,String s1,String s2,int arr[][]){
        
    //     if(i==0 || j==0) return 0;
    //     if(arr[i][j]!=0) return arr[i][j];
    //     if(s1.charAt(i)==s2.charAt(j)) return arr[i][j]=1+rec(i-1,j-1,s1,s2,arr);
    //     return arr[i][j]=Math.max(rec(i-1,j,s1,s2,arr),rec(i,j-1,s1,s2,arr));
    // }
}
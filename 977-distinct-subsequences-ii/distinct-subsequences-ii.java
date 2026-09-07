class Solution {
    public int distinctSubseqII(String s) {
        int arr[]=new int[26];
        int tot=0;

        int mod=1000000007;

        for(char c:s.toCharArray()){
            int ind=c-'a';

            int newTot=(tot+1-arr[ind]+mod)%mod;

            tot=(tot+newTot)%mod;

            arr[ind]=(arr[ind]+newTot)%mod;
        }
        return tot;

    }
}
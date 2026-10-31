class Solution {
    public int climbStairs(int n) {
    //   return cs(n);

    int arr[]=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

    // int cs(int n){
    //     if(n==0) return 1;
    //   if(n==1) return 1;
    //   int l=cs(n-1);
    //   int r=cs(n-2);
    //   return l+r;
    // }
}
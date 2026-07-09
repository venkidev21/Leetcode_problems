class Solution {
    public int countPrimes(int n) {
        boolean b[]=new boolean[n+1];
        if(n<=1) return 0;
        Arrays.fill(b,true);
        b[0]=false;
        b[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(!b[i]) continue;
           
            for(int j=i*i;j<=n;j+=i){
                b[j]=false;
            }
        }
        // System.out.println(Arrays.toString(b));
        int count =0;
        for(int i=2;i<n;i++){
            if(b[i]) count++;
        }
        return count;
    }
}
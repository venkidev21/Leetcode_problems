class Solution {
    public int smallestNumber(int n, int t) {
        while(!cheak(n,t)){
            n++;
        }
        return n;
        
    }
    boolean cheak(int n,int t){
        int pro=1;
        while(n!=0){
            pro*=(n%10);
            n/=10;
        }
        return pro%t==0;
    }
}
class Solution {
    public long countCommas(long n) {
       if(n<999) return 0;
      long count=0;

      long pro=1000;
     for(int i=0;i<5;i++){
        if(pro<=n){
            count+=(n-pro)+1;
        }
        else break;
        pro*=1000;
     }
    return count;
    }
}
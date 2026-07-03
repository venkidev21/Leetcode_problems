class Solution {
public:
    long long countCommas(long long n) {
        long long ans=0;
        if(n<999)
            return 0;
        long long pow=1000;
        for(int i=0;i<5;i++){
            if(pow<=n){
                ans+=n-pow+1;
            }
            else 
                break;
            pow*=1000;
        }
        return ans;

    }
};
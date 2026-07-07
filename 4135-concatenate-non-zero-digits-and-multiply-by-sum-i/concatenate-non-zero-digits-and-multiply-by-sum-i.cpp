class Solution {
public:
    long long sumAndMultiply(int n) {
        long long sum=0;
        long long x=0;
        long long pow=1;
        int num=n;
        while(num!=0){
            int dig=num%10;
            if(dig!=0){
            x=dig*pow+x;
            sum+=dig;
            pow*=10;
            }
             num/=10;
        }
        return x*sum;
    }
};
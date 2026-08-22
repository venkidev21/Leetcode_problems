class Solution {
public:
    bool checkDivisibility(int n) {
        long sum=0;
        long pro=1;
        long k=n;
        while(n!=0){
            sum+=n%10;
            pro*=n%10;
            n/=10;
        }
        cout<<n<<" " << pro;
      
        return k%(sum+pro)==0;
    }
};
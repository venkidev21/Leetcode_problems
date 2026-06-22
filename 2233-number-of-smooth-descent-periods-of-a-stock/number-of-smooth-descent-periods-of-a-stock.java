class Solution {
    public long getDescentPeriods(int[] prices) {
        // one is subarray with privious if(nums[i]==nums[i-1]-1)
        // it is subarray with privous arra and count
        // sunb     size                                tot
        //          curr                                cout
        // 3        1                                   1
        // 3 2      2(2,3 2)                            3
        // 3 2 1    3(3,2,1, 3 2 , 2 1,3 2 1)           6
        // now 4 is(4-1) =3 not smoot so this new star curr=1
        // else it is new subarray if not==same
         // 4        1(4)                                7
        long c=1;
        int s=0;
        int curr=1;
        for(int e=1;e<prices.length;++e){
            //curr++;
            if(prices[e-1]-1==prices[e]) ++curr;
            else {
                curr=1;
            }
            c+=curr;
            
        }
        return c;
    }
}
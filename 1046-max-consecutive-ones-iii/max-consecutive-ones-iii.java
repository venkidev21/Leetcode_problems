class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        // int one=0;
        int zero=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=1) zero++;
            while(zero>k){
                if(nums[l]==0) zero--;
                l++;
            }

            max=Math.max(max,r-l+1);


        }
        return max;
    }
}
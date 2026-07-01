class Solution {
    public int waysToSplitArray(int[] nums) {
        int ans=0;
        long sum=0;
        long pre=0;
        for(int i=0;i<nums.length;i++){
            pre+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            sum+=nums[i];
            pre-=nums[i];
            if(sum>=pre) ans++;
            
        }
        return ans;


    }
}
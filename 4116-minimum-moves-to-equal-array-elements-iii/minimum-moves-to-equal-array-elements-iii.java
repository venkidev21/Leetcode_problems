class Solution {
    public int minMoves(int[] nums) {
        int a=nums[0];
        for(int i:nums){
            a=Math.max(a,i);
        }

        int ans=0;
        for(int i:nums){
            ans+=(a-i);
        }

        return ans;
    }
}
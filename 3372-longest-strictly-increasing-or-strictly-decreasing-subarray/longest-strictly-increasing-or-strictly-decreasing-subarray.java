class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=0;
       int c=1;
      
        for(int i=1;i<nums.length;i++){
           if(nums[i]>nums[i-1]) c++;
           else{
            max=Math.max(c,max);
            c=1;
           }
        }
        max=Math.max(c,max);
         int DecMax=0;
          c=1;
          for(int i=1;i<nums.length;i++){
           if(nums[i]<nums[i-1]) c++;
           else{
            max=Math.max(c,max);
            c=1;
           }
        }
         max=Math.max(c,max);
        return Math.max(max,DecMax);
    }
}
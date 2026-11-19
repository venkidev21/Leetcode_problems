class Solution {
    public int minimizeSum(int[] nums) {
       

        // int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int n=nums.length;
        //chage first two element to third nums[0]=nums[1]=>nums[2]
        // mindif=nums[0]-nums[1]=0
        // Maxdiff=nums[0]-nums[n-1]
        int min=Math.abs(nums[2]-nums[n-1]);

        //chage first and last element to third nums[0]=nums[1] and nums[n-1]=nums[n-2]
        // mindif=nums[0]-nums[1]=0
        // Maxdiff=nums[0]-nums[n-1]=>(nums[n-2])

        min=Math.min(min,Math.abs(nums[1]-nums[n-2]));

        //chage  last two element to third nums[n-1]=nums[n-2]=>nums[n-3]
        // mindif=nums[0]-nums[1]=0
        // Maxdiff=nums[0]-nums[n-1]=>(nums[n-2])
        
        min=Math.min(min,Math.abs(nums[0]-nums[n-3]));

            return min;


    }
}
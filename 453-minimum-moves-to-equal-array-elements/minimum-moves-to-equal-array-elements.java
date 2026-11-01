class Solution {
    public int minMoves(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length-1;

        // int c=0;
        // while(nums[0]!=nums[n]){
        //     for(int i=0;i<n;i++){
        //         nums[i]+=1;

        //     }
        //     Arrays.sort(nums);
        //     c++;
        // }
        // return c;

        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
        }

        int a=0;
        for(int i=0;i<nums.length;i++){
            a+=nums[i]-min;
        }
        return a;
    }
}
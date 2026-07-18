class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int b=nums[0];
        int a=nums[nums.length-1];
        while(a%b!=0){
            int c=a%b;
            a=b;
            b=c;
           
        }
        return b;
        // return gcd(nums[0],nums[nums.length-1]);
    }

}
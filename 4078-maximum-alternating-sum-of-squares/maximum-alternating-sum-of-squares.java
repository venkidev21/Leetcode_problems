class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);

        // int temp[]=new int[nums.length];
        int l=0;
        int r=nums.length-1;

        // int i=0;
        // int j=1;
        long rs=0;
        while(l<r){
            // temp[i]=nums[r];
            // temp[j]=nums[l];
            // i++;
            // j++;
            // l++;
            // r--;

            rs+=nums[r]*nums[r];
            rs-=nums[l]*nums[l];
            r--;
            l++;
        }
        if(l==r){
            rs+=nums[l]*nums[l];
        }

        // System.out.println(Arrays.toString(temp));
        // long rs=0;
        // for( i=0;i<nums.length;i++){
        //     rs+=temp[i]*temp[i];
        //     i++;
        //     if(i<nums.length){
        //         rs-=(temp[i]*temp[i]);
        //     }
        // }

        return rs;

    }
}
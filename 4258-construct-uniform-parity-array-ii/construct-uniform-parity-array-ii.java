class Solution {
    public boolean uniformArray(int[] nums1) {
        // int eve=0;
        // int odd=0;
        // for(int i=0;i<nums1.length;i++){
        //     if(nums1[i]%2==0) eve++;
        //     else if(nums1[i]%2==1) odd++;
        //     else{
        //         for(int j=0;j<nums1.length;j++){
        //             if(i!=j && nums1[i]-nums1[j]>=1){
        //                 if((nums1[i]-nums1[j])%2==0) eve++;
        //                 else odd++;

        //                 break;
        //             }
        //         }
        //     }
        // }

        // return odd==nums1.length || eve==nums1.length;

        int min=nums1[0];
        boolean odd=false;
        for(int i:nums1){
            min=Math.min(min,i);
            // odd (i%2==0)
            if((i&1)==1) odd=true;
        }

        if((min&1)==1) return true;

        return !odd;
    }
}
class Solution {
    public int trap(int[] height) {
        int lmax=0;
        int rmax=0;
        int water=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            if(height[l]<=height[r]){
                lmax=Math.max(lmax,height[l]);
                water+=lmax-height[l];
                l++;
            }
            else{
                rmax=Math.max(rmax,height[r]);
                water+=rmax-height[r];
                r--;
            }
        }
        return water;
    }
}
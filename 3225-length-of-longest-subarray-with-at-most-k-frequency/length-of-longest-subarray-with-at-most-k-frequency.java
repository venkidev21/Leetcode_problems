class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
       Map<Integer,Integer> mp=new HashMap<>();
        int max=0;
       int l=0;
       for(int r=0;r<nums.length;r++){
            mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);
            while(mp.get(nums[r])>k){
                mp.put(nums[l],mp.getOrDefault(nums[l],1)-1);
                l++;
            }
            
            max=Math.max(max,r-l+1);

       }
        
        return max;
    }
}  
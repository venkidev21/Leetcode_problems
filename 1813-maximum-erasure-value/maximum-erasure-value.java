class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> st=new HashSet<>();
        int s=0;
        int max_sub=0;
        int cur_sum=0;
        for(int e=0;e<nums.length;e++){
            while(st.contains(nums[e])){
                st.remove(nums[s]);
                cur_sum-=nums[s];
                s++;
            }
            st.add(nums[e]);
            cur_sum+=nums[e];
            max_sub=Math.max(max_sub,cur_sum);

        }
        return max_sub;
    }
}
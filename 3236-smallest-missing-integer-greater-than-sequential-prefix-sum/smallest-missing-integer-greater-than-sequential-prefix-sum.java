class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int i:nums){
            st.add(i);

        }
        int tot=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                tot+=nums[i];
            }
            else break;
        }
        while(st.contains(tot)){
            tot++;

        }
        return tot;
    }
}
class Solution {
    public int singleNonDuplicate(int[] nums) {
      Set<Integer> st=new HashSet<>();
      for(int i=0;i<nums.length-1;i++){
        if(st.add(nums[i]) && st.add(nums[i+1])) return nums[i];
      }  
      return nums[nums.length-1];
    }
}
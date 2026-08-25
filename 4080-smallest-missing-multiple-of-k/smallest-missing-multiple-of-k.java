class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        int mul=k;
        while(st.contains(mul)){
            mul+=k;
        }
        return mul;
    }
}
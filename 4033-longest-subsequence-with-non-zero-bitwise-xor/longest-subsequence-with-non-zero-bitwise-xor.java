class Solution {
    public int longestSubsequence(int[] nums) {
       int xor=0;
       boolean k=false;
       for(int i:nums){
        if(i!=0) k=true;
        xor^=i;
       } 
       if(!k) return 0;
       if(xor!=0) return nums.length;
       else return nums.length-1;
    }
}
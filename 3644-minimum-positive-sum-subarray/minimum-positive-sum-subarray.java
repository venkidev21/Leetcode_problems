class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
       
        
        int min=Integer.MAX_VALUE;
      
        for(int left=0;left<nums.size();left++){
            int sum=0;
            for(int right=left;right<nums.size();right++){
                sum+=nums.get(right);
                int len=right-left+1;

                if(len>=l && len<=r && sum>0) {
                    min=Math.min(sum,min);
                }

                if(len>=r) break;
                
            }
        }

        return min==Integer.MAX_VALUE?-1:min;
        
    }
}
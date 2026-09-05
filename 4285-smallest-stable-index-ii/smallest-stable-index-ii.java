class Solution {
    public int firstStableIndex(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->nums[a]-nums[b]);
        for(int i=0;i<nums.length;i++){
            pq.add(i);
        }
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            while(pq.peek()<i){
                pq.poll();
            }

            if(max-nums[pq.peek()]<=k){
                return i;

            }

        }
        return -1;
    }
}
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->nums[a]-nums[b]);
        for(int i=0;i<nums.length;i++){
            pq.add(i);
        }
        int c=0;
        int l=nums[0];
        int r=pq.peek();
        for(int i=0;i<nums.length;i++){
            l=Math.max(l,nums[i]);
            
            while(!pq.isEmpty() && pq.peek()<i){
                pq.poll();
            }
            if(pq.isEmpty()) break;
            r=pq.peek();
            System.out.println(l+" "+nums[r]);
            if(l-nums[r]<=k) return i;
        }
        return -1;

    }
}
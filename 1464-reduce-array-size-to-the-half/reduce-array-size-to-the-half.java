class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> q=new PriorityQueue<>(
            (a,b)->b.getValue()-a.getValue());
        q.addAll(mp.entrySet());
        int num=arr.length;
        int n=arr.length;
        int count=0;
        while(!q.isEmpty() && num>n/2){
            num-=q.poll().getValue();
            count++;
        }
        return count;


    }
}
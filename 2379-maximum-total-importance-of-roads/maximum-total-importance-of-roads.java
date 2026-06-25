class Solution {
    public long maximumImportance(int n, int[][] roads) {
        // Arrays.sort(roads,(a,b)->b[1]-a[1]);
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i[]:roads){
            mp.put(i[1]+1,mp.getOrDefault(i[1]+1,0)+1);
             mp.put(i[0]+1,mp.getOrDefault(i[0]+1,0)+1);
        }
        int arr[]=new int[n];
        int num=n;
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
            (a,b)->b.getValue()-a.getValue());
        pq.addAll(mp.entrySet());
        while(!pq.isEmpty()){
            Map.Entry<Integer,Integer> e = pq.poll();
            arr[e.getKey()-1]=num;
            num--;
        }
        // System.out.println(Arrays.toString(arr));
        long rs=0;
        for(int i[]:roads){
            rs+=arr[i[0]]+arr[i[1]];
        }
        return rs;
    }
}
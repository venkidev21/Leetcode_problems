class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> ls=new ArrayList<>();
        for(int i=0;i<=n;i++){
            ls.add(new ArrayList<>());
        }

        for(int[] edge:times){
            ls.get(edge[0]).add(new int[]{edge[1],edge[2]});
        }

        int dist[]=new int[n+1];
        dist[0]=0;
        int minTime=-1;
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);

        pq.offer(new int[]{k,0});

        while(!pq.isEmpty()){
            int curr[]=pq.poll();
             
            int currNode=curr[0];
            int currWeight=curr[1];

            for(int[] nigb:ls.get(currNode)){
                int nigbNode=nigb[0];
                int nigbWeight=nigb[1];
                int newWeight=currWeight+nigbWeight;
                if(dist[nigbNode]>newWeight){
                    // minTime=Math.max(minTime,newWeight);
                    dist[nigbNode]=newWeight;
                    pq.offer(new int[]{nigbNode,newWeight});
                }
            }
        }
        int count=0;
        
        // for(int i:)
        for(int i:dist){
            if(i!=Integer.MAX_VALUE){
                count++;
             minTime=Math.max(minTime,i);
            } 
        }
        //System.out.println(count);
        if(count!=n) return -1;
        return minTime;
    }

}
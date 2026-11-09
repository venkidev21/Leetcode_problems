class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        PriorityQueue<int[]> loaded=new PriorityQueue<>((a,b)->{
            if(a[1]==b[1]) return a[0]-b[0];
            return a[1]-b[1];
        });
        TreeSet<Integer> available=new TreeSet<>();
        for(int i=0;i<k;i++){
          available.add(i);
        }

        // int time=0;
        int max=0;
        int count[]=new int[k];
        for(int i=0;i<arrival.length;i++){
            int start=arrival[i];
            int end=load[i];

            free(start,loaded,available);

             if(available.isEmpty() ) continue;

            int target=i%k;

            Integer serverId = available.ceiling(target);

            if(serverId == null){
                serverId=available.first();
            }

            count[serverId]++;

            
            max=Math.max(count[serverId],max);
            loaded.add(new int[]{serverId,start+end});
            available.remove(serverId);
            
            
        }

        
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<k;i++){
            if(count[i]==max) ls.add(i);
        }

        return ls;

    }

    void free(int time,PriorityQueue<int[]> load, Set<Integer> avail){
        while(!load.isEmpty() && load.peek()[1]<=time){
            int server[]=load.poll();
           avail.add(server[0]);
           
        }
    }
}
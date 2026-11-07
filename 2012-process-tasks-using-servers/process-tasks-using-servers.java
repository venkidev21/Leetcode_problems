class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
       PriorityQueue<int[]> avilabe=new PriorityQueue<>((a,b)->{
        if(a[0]==b[0]) return a[1]-b[1];
        return a[0]-b[0];
       }) ;

       PriorityQueue<int[]> unavailable=new PriorityQueue<>((a,b)->{
        return a[0]-b[0];
       }) ;

        for(int i=0;i<servers.length;i++)
        {
            avilabe.add(new int[]{servers[i],i});
        }
        int tasktime=0;
        int ans[]=new int[tasks.length];
        for(int i=0;i<tasks.length;i++){
            tasktime=Math.max(tasktime,i);
            free(avilabe,unavailable,servers,tasktime);

            if(avilabe.isEmpty()){
                tasktime=unavailable.peek()[0];
                free(avilabe,unavailable,servers,tasktime);
            }

            int server[]=avilabe.poll();
            int idx=server[1];
            ans[i]=idx;
            unavailable.offer(new int[]{tasktime+tasks[i],idx});
        }

        return ans;
    }

    void free(PriorityQueue<int[]> avail, PriorityQueue<int[]> unavail, int servers[],int taskTime){

        while(!unavail.isEmpty() && unavail.peek()[0]<=taskTime){
            int server[]=unavail.poll();
            int idx=server[1];
            avail.add(new int[]{servers[idx],idx});
        }
    }

}
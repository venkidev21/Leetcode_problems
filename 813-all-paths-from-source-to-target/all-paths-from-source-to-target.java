class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ls=new ArrayList<>();
        List<List<Integer>> adj=new ArrayList<>();
        int n=graph.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
           
        }

        for(int i=0;i<graph.length;i++){
            for(int j:graph[i]){
                adj.get(i).add(j);
            }
        }
        List<Integer> rs=new ArrayList<>();
        rs.add(0);
        DFS(adj,ls,0,graph.length-1,rs);

        return ls;
        
    }

    void DFS(List<List<Integer>> adj, List<List<Integer>> ls,int src, int des ,List<Integer> rs ){
        if(src==des){
           ls.add(new ArrayList<>(rs));
           return ;
            
        }

        for(int i:adj.get(src)){
            rs.add(i);
            DFS(adj,ls,i,des,rs);
            rs.remove(rs.size()-1);
        }
    }
}
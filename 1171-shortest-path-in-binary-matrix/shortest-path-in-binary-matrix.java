class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int dist[]=new int[grid.length];
        int n=grid.length;
        if(grid[n-1][n-1]==1) return -1;
        Queue<int[]> q=new LinkedList<>();
        int shortPath=Integer.MAX_VALUE;
        q.add(new int[]{0,0,0});
        while(!q.isEmpty()){
            int curr[]=q.poll();
            if(curr[0]==n-1 && curr[1]==n-1){
            
                shortPath=Math.min(curr[2]+1,shortPath);
                continue;
            }

            int i=curr[0];
            int j=curr[1];
            int dis=curr[2];
            if( i<0 || i>=n  || j<0 || j>=n) continue;
            if(grid[i][j]==1) continue;
            grid[i][j]=1;

            // bottom
            q.add(new int[]{i+1,j,dis+1});
            // top
             q.add(new int[]{i-1,j,dis+1});

            // right
            q.add(new int[]{i,j+1,dis+1});
            // left
             q.add(new int[]{i,j-1,dis+1});
            // diag bot right 
            q.add(new int[]{i+1,j+1,dis+1});

            // DIG BOT LEFT
            q.add(new int[]{i+1,j-1,dis+1});

            // dig top left
            q.add(new int[]{i-1,j-1,dis+1});
            // DIG TOP RIGHT
            q.add(new int[]{i-1,j+1,dis+1});
           

        }
        return shortPath==Integer.MAX_VALUE?-1:shortPath;
    }
}
class Solution {
    public int countServers(int[][] grid) {
      // Set<int[]> st=new HashSet<>();
        int m=grid.length;
        int n=grid[0].length;
        int row[]=new int[n];
        int col[]=new int[m];
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==1){
                row[j]++;
                col[i]++;
            }
        }
       } 

       for(int i=0;i<m;i++){
            if(col[i]==1){
                for(int j=0;j<n;j++){
                    //if(grid[i][j]==1) st.add(new int[]{i,j});
                    if(row[j] <=1 )grid[i][j]=0;
                }
            }
       }

        for(int i=0;i<n;i++){
            if(row[i]==1){
                for(int j=0;j<m;j++){
                    // if(grid[j][i]==1) st.add(new int[]{j,i});
                    if(col[j] <=1 ) grid[j][i]=0;
                }
            }
            
       }

    int c=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==1) c++;
        }
    }
       return c;
    }
}
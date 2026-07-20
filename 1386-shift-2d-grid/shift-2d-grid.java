class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       List<Integer> ls=new ArrayList<>();
       k%=grid.length*grid[0].length;
       int t=k;
       for(int i=grid.length-1;i>=0 && t>0;i--){
        for(int j=grid[0].length-1;j>=0 && t>0;j--){
            ls.add(grid[i][j]);
            t--;
        }
       }
        Collections.reverse(ls);
        int n=grid.length*grid[0].length;
        for(int i=0;i<grid.length && n>0;i++){
            for(int j=0;j<grid[0].length && n>0;j++){
                ls.add(grid[i][j]);
                n--;
            }
        }
       

        t=0;
        List<List<Integer>> rs=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<grid[0].length ;j++){
              l.add(ls.get(t));
                t++;
            }
            rs.add(l);
        }
       
       return rs;
    }
}
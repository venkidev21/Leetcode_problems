class Solution {
    public int findCenter(int[][] edges) {
       
            int v=edges[0][0];
            int w=edges[0][1];
            if(v==edges[1][0] || v==edges[1][1]) return v;
            else return w;

    }
}
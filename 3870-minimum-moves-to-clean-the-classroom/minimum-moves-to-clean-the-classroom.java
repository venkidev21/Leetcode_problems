class Solution {
    static class state{
        int row;
        int col;
        int e;
        int Litter ;
        state(int r,int c,int e,int l ){
            row=r;
            col=c;
            this.e=e;
            this.Litter =l;
        }
    }
    public int minMoves(String[] classroom, int energy) {
        int n=classroom.length;
        int m=classroom[0].length();

        int startRow=0;
        int startCol=0;
        int totLitter=0;

        int LitterNum[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                char cell=classroom[i].charAt(j);
                if(cell=='S'){
                    startRow=i;
                    startCol=j;
                }

                if(cell=='L'){
                    LitterNum[i][j]=totLitter;
                    totLitter++;
                }
                else LitterNum[i][j]=-1;
            }
        }

        int all=(1<<totLitter)-1;

        Queue<state> q=new LinkedList<>();

        q.offer(new state(startRow,startCol,energy,0));

        boolean visited[][][][]=new boolean[n][m][energy+1][1<<totLitter];

        visited[startRow][startCol][energy][0]=true;

        int[][] dir={
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };

        int move=0;
        // Level order traversal like track level

        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                state curr=q.poll();

                if(curr.Litter==all) return move;

                if(curr.e==0) continue;

                for(int[] d:dir){
                    int newrow=curr.row+d[0];
                    int newcol=curr.col+d[1];

                    if(newrow<0 || newrow>=n || newcol<0 || newcol>=m) continue;

                    char cell=classroom[newrow].charAt(newcol);

                    if(cell=='X') continue;

                    int enrg=curr.e-1;

                    int Littermask=curr.Litter;

                     if(cell=='L') {

                        int LitterNumber=LitterNum[newrow][newcol];
                        // bit mask to mark lit

                        Littermask |=(1<<LitterNumber);
                     }

                    if(cell=='R') enrg=energy;

                    if(visited[newrow][newcol][enrg][Littermask]) continue;

                    visited[newrow][newcol][enrg][Littermask]=true;

                    q.add(new state(newrow,newcol,enrg,Littermask));


                }
            }
            move++;
        }
        return -1;
    }
}
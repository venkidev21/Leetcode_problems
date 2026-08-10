class Solution {
    int ans=0;
    public int totalNQueens(int n) {
        int[][] board=new int[n][n];
        solve(board,0,n);
        return ans;
    }

    void solve(int[][] board,int row,int n){
        if(row==n){
            ans++;
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(board,row,col)){
                board[row][col]=1;
                solve( board, row+1, n);
                 board[row][col]=0;
            }

        }

    }
     boolean isSafe(int[][] ch,int i,int j){
        for(int k=i;k>=0;k--){
            if(ch[k][j]==1) return false;
        }

        int row=i;
        int col=j;
        while(row>=0 && col>=0){
            if(ch[row][col]==1) return false;
            row--;
            col--;
        }

        row=i;
        col=j;

        while(row>=0 && col<ch.length){
            if(ch[row][col]==1) return false;
            row--;
            col++;
        }
        return true;
     }
}
class Solution {
    public boolean exist(char[][] board, String word) {
       for(int i=0;i<board.length;i++){
        for(int j=0;j<board[i].length;j++){
        if(board[i][j]==word.charAt(0)){

         if(find(board,word,i,j,0)){
                return true;
            }
        }
        }
       }
        return false;
    }
    boolean find(char[][] board , String word,int i,int j,int p){
        
        if(word.length()==p) return true;
        // System.out.println(i+" "+j+" "+board[i][j]+" "+ word.charAt(p));
        // if(board[i][j]==word.charAt(p)) return true;
       
        if(i<0 || j<0 ||i>=board.length | j>=board[0].length ||
         board[i][j]=='#' ||board[i][j]!=word.charAt(p) ){
           // System.out.println("BachTrecking");
            return false;
         } 

        // System.out.println(i+" "+j+" "+board[i][j]+" "+ word.charAt(p));
        char t=board[i][j];
        board[i][j]='#';
        boolean up=find(board,word,i-1,j,p+1);
        boolean down= find( board,word,i+1,j,p+1) ;
        boolean right=find( board,word,i,j-1,p+1);
        boolean left=find( board,word,i,j+1,p+1);
        if(up || down || right || left ){
                return true;
            }
        board[i][j]=t;
        return false;
    }
}
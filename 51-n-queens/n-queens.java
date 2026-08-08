class Solution {
     List<List<String>> ls=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
       char[][] ch=new char[n][n];
       for(char[] c:ch){
       Arrays.fill(c,'.');
       }
       solve(ch,0,n);
       return ls;
    }
    void solve(char[][] ch,int i ,int n){
        if(i==n){
            List<String> lk=new ArrayList<>();
            for(char[] c:ch){
                lk.add(new String(c));

            }
            // System.out.println("____");
            ls.add(lk);
            return;
        }
        
            

        for(int j=0;j<n;j++){
            if(safe(ch,i,j)){
                ch[i][j]='Q';
                solve(ch,i+1,n);
                ch[i][j]='.';
            }
        }
    }
    boolean safe(char[][] ch,int i,int j){
        for(int k=i;k>=0;k--){
            if(ch[k][j]=='Q') return false;
        }
        int k=i;
        int p=j;
        while(k>=0 && p>=0){
            if(ch[k][p]=='Q') return false;
            k--;
            p--;
        }
         k=i;
         p=j;
        while(k>=0 && p<ch[0].length){
            if(ch[k][p]=='Q') return false;
            k--;
            p++;
        }
        return true;
    }
}
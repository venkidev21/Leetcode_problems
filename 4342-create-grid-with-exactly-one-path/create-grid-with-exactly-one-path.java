class Solution {
    public String[] createGrid(int m, int n) {
        String rs[]=new String[m];

        rs[0]=".".repeat(n);
        for(int i=1;i<m;i++){
            String temp="#".repeat(n-1);
            temp+=".";
            rs[i]=temp;
        }
        return rs;
    }
}
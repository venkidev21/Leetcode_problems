class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int l=0;
        int r=n-1;
        int t=0;
        int b=n-1;
        int k=1;
        while(l<=r && t<=b){
            // top of mat
            for(int i=l;i<=r;i++){
                arr[t][i]=k++;
            }
            t++;
            // right silde
            for(int i=t;i<=b;i++){
                arr[i][r]=k++;
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    arr[b][i]=k++;
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    arr[i][l]=k++;
                }
                l++;
            }
        }
        return arr;
    }
}
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int n=sum;
        int k=9;
        StringBuilder sb=new StringBuilder();
   
        for(int i=0;i<num;i++){
            //if(n==0) break;
            for(int j=9;j>=0;j--){
                if(n>=j){
                    n-=j;
                    sb.append(j);
                    break;
                }
            }
        }
        return (n==0)?sb.toString():"";
    }
}
class Solution {
    public int minSwapsCouples(int[] row) {
        int c=0;
        // for(int i=1;i<row.length;i++){
        //     if(row[i-1]-1!=row[i] ){
        //         c++;
        //         //System.out.println(row[i-1]+" "+row[i]);
                
        //     }
            
        //     i++;
            
        // }
        for(int i=0;i<row.length;i+=2){
           int pat=row[i]^1;
           if(row[i+1]!=pat){
            int j=i+1;
            while(j<row.length && row[j]!=pat){
                j++;
            }
            int temp=row[i+1];
            row[i+1]=row[j];
            row[j]=temp;
            c++;
           }
        }
        
        return c;

    }
}
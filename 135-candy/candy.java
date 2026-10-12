class Solution {
    public int candy(int[] ratings) {
        int left[]=new int[ratings.length];

        Arrays.fill(left,1);

        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                left[i]+=left[i-1];
            }
            
        }
    //    System.out.println(Arrays.toString(left));
        int curr=1;
       
        int sum=Math.max(left[left.length-1],1);

        for(int r=ratings.length-2;r>=0;r--){
            if(ratings[r]>ratings[r+1]){
                curr++;

            }
            else curr=1;

            sum+=Math.max(curr,left[r]);
        }
            return sum;
    }
}
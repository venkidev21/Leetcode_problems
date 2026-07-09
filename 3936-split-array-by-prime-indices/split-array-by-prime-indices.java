class Solution {
    public long splitArray(int[] nums) {
        boolean b[]=new boolean[nums.length+1];
        Arrays.fill(b,true);
        b[0]=false;
        b[1]=false;
        for(int i=2;i<=Math.sqrt((nums.length));i++){
            if(!b[i]) continue;
            for(int j=i*i;j<=nums.length;j+=i){
                b[j]=false;
            }
        }
        long a=0;
        long B=0;
        for(int i=0;i<nums.length;i++){
            if(b[i]) a+=nums[i];
            else B+=nums[i];
        }
        return Math.abs(a-B);
    }
}
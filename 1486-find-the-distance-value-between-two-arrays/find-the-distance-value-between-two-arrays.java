class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int i:arr1){
            boolean fg=true;
            for(int y:arr2){
                fg&=Math.abs(i-y)>d;
            }

            if(fg) c++;
        }
        return c;
    }
}
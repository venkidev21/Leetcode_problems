class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        // reaarrange the array
        Arrays.sort(arr);
        // first shuld be 1
        arr[0]=1;
        int max=arr[0];
        // decrease
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]>1){
                arr[i]=arr[i-1]+1;
               
            }
             max=Math.max(max,arr[i]);
        }
        return max;
    }
}
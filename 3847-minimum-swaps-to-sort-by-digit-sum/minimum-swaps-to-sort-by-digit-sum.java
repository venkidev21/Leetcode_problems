class Solution {
    public int minSwaps(int[] nums) {
        int arr[][]=new int[nums.length][2];

        for(int i=0;i<nums.length;i++){
            int sum=0;
            int k=nums[i];
            while(k!=0){
                sum+=k%10;
                k/=10;
            }

            arr[i][0]=nums[i];
            arr[i][1]=sum;
        }
    

   Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });


    Map<Integer,Integer> mp=new HashMap<>();

    for(int i=0;i<nums.length;i++){
        mp.put(nums[i],i);
    }
    
    int Swap_count=0;
    for(int i=0;i<nums.length;i++){
        int ActualIndex=mp.get(arr[i][0]);
        if(i==ActualIndex) continue;
        int temp=nums[i];
        nums[i]=nums[ActualIndex];
        nums[ActualIndex]=temp;
       

        mp.put(nums[i],i);
        mp.put(nums[ActualIndex],ActualIndex);
        Swap_count++;
    }
    return Swap_count;
}

}
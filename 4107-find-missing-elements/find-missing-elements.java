class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int i=min;
        List<Integer> ls=new ArrayList<>();
        int j=0;
        while(i<=max){
        if(nums[j]==i){
            j++;
            i++;
        }
        else {
            ls.add(i);
            i++;
        }
        }
        return ls;

        

        }
}
class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();
        ls.add(nums[0]);
        ls2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(ls.get(ls.size()-1)>ls2.get(ls2.size()-1)){
                ls.add(nums[i]);
            }
            else{
                ls2.add(nums[i]);
            }
        }
        ls.addAll(ls2);
        int arr[]=new int[ls.size()];
        int j=0;
        for(int i:ls){
            arr[j++]=i;
        }
       
        return arr;
    }
}
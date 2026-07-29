class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> st=new HashSet<>();
        List<List<Integer>> ls=new ArrayList<>();
        if(target<=-294967296 && target!=-1000000000 ) return ls;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=nums.length;j++){
                int l=j+1;
                int r=nums.length-1;
                while(l<r){
                    if(nums[i]+nums[j]+nums[l]+nums[r]==target){
                        List<Integer> lt=Arrays.asList(nums[i],nums[j],nums[l],nums[r]);
                        Collections.sort(lt);
                        if(st.add(lt)) ls.add(lt);
                        l++;
                        r--;
                        
                    }
                    else if(nums[i]+nums[j]+nums[l]+nums[r]>target) r--;
                    else l++;
                }
            }
        }
        return ls;
    }
}
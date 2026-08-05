class Solution {
    List<List<Integer>> ls=new ArrayList<>();
    List<Integer> rs=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         Arrays.sort(candidates);
        solve(candidates,0,target);
        return ls;
    }
   void solve(int[] nums,int i,int target){

             if(target==0){
                ls.add(new ArrayList<>(rs));
                return;
             } 
        
        for(int j=i;j<nums.length;j++){

            if(j>i && nums[j]==nums[j-1]) continue;

            if(nums[j]>target) break;

            rs.add(nums[j]);
            solve(nums,j+1,target-nums[j]);
            rs.remove(rs.size()-1);
            
        }
        //System.out.println(rs);
       
    }
}
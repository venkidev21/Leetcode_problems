class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ls=new ArrayList<>();
        solve(nums,ls,new ArrayList<>(),0);
        return ls;
    }
    static void solve(int[] nums,List<List<Integer>> ls,List<Integer> rs,int i){
        if(i==nums.length){
            if(!ls.contains(new ArrayList<>(rs))) ls.add(new ArrayList<>(rs));
            return;
        }
        rs.add(nums[i]);
        solve(nums,ls,rs,i+1);
        rs.remove(rs.size()-1);
        solve(nums,ls,rs,i+1);
    }
}
class Solution {
    List<List<Integer>> ls=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        solve(nums,new boolean[nums.length],new ArrayList<>());
        return ls;
        
    }
    void solve(int[] nums,boolean[] visited,List<Integer> rs){
        if(rs.size()==nums.length){
            ls.add(new ArrayList<>(rs));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                rs.add(nums[i]);
                solve(nums,visited,rs);
                rs.remove(rs.size()-1);
                visited[i]=false;
            }
        }
    }
}
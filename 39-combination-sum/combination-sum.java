class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ls=new ArrayList<>();
        solve(candidates,ls,new ArrayList<>(),0,0,target);
        return ls;
    }
    void solve(int num[],List<List<Integer>> ls,List<Integer> rs,int i,int sum,int tar){
        if(i==num.length){
            return;
        }
        if(sum>tar){
           return;
        }
        if(sum==tar){
            ls.add(new ArrayList<>(rs));
            return;
        }
        rs.add(num[i]);
        sum+=num[i];
        solve( num,ls,rs,i,sum,tar);
        rs.remove(rs.size()-1);
        sum-=num[i];
        solve( num,ls,rs,i+1,sum,tar);
    }
}
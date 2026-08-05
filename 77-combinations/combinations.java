class Solution {
    public List<List<Integer>> combine(int n, int k) {
        // int arr[]=new int[n+1];
        // for(int i=0;i<n;i++){
        //     arr[i]=i+1;
        // }
        List<List<Integer>> ls=new ArrayList<>();
        solve(n,ls,new ArrayList<>(),1,k,new HashSet<>());

        return ls;
    }
    void solve(int n,List<List<Integer>> ls,List<Integer> rs,int i,int k,Set<List<Integer>> st){
         if(i>n+1) return;
        if(rs.size()==k){
             if(st.add(new ArrayList<>(rs))) ls.add(new ArrayList<>(rs));
            return;
        }
        rs.add(i);
        solve(n,ls,rs,i+1,k,st);
        rs.remove(rs.size()-1);
        solve(n,ls,rs,i+1,k,st);
    }

}
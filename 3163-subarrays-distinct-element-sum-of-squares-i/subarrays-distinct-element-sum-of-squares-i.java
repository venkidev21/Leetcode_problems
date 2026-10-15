class Solution {
    public int sumCounts(List<Integer> nums) {
        
        int ans=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                ans+=Math.pow(count(nums,i,j),2);

            }
        }
        return ans;



    }

    int count(List<Integer> ls,int i,int j){
        int c=0;
        Set<Integer> st=new HashSet<>();
        while(i<=j){
            if(st.add(ls.get(i))) c++;
            i++;
        }

        return c;
    }
}
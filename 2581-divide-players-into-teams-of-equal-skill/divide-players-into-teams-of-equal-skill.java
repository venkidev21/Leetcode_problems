class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        long ans=0;
        int tem=skill[0]+skill[n-1];
        for(int i=0;i<n/2;i++){
            // System.out.println(skill[i]+" "+skill[n-i-1]);
            if(tem!=(skill[i]+skill[n-i-1])) return -1;
            ans+=(skill[i]*skill[n-i-1]);
        }
        return ans;
    }
}
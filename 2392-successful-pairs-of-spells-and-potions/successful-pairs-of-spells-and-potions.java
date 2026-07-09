class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int ans[]=new int[spells.length];
        int n=potions.length;
        for(int i=0;i<spells.length;i++){
            int spell=spells[i];
            int l=0;
            int r=potions.length-1;
            int ind=-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if((long)potions[mid]*spell>=success){
                     ind=mid;
                     r=mid-1;
                }
                else l=mid+1;
            }
            if(ind!=-1){
                ans[i]=n-ind;

            }
            
        }
        return ans;
    }
    
}
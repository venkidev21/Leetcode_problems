class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs,(a,b)->a[1]-b[1]);

        // Arrays.sort(queries);
        int query[][]=new int[queries.length][2];

        for(int i=0;i<queries.length;i++){
            query[i][0]=queries[i];
            query[i][1]=i;
        }

        Arrays.sort(query,(a,b)->a[0]-b[0]);
        int ans[]=new int[queries.length];

         int left=0;
         int right=0;
         int active=0;

         int freq[]=new int[n+1];
        for(int j=0;j<queries.length;j++){

            int end=query[j][0];
            while(right<logs.length && logs[right][1]<=end){
               
                if(freq[logs[right][0]]==0) active++;
                freq[logs[right][0]]++;
                right++;
            }
            while(left<logs.length && logs[left][1]<end-x){
                freq[logs[left][0]]--;
                if(freq[logs[left][0]]==0) active--;
                left++;
            }
            ans[query[j][1]]=n-active;
        }

        return ans;
    }
}
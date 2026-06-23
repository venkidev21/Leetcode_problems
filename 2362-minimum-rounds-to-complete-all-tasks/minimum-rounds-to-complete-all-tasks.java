class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:tasks){
            mp.put(i,mp.getOrDefault(i,0)+1);

        }
        List<Integer> ls=new ArrayList<>(mp.keySet());
        int r=0;
        // System.out.println(mp);
        for(int i:ls){
            int k=mp.get(i);
            if(k==1) return -1;
            if(k==2) r++;   
           else if(k%3==0) r+=k/3;
           else if(k%3==1){
            r+=((k-1)/3);
            r++;
           }
           else {
                r+=k/3;
                r++;
           }
        }
        return r;
    }
}
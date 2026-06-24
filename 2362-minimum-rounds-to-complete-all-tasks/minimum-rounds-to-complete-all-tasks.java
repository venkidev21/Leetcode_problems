class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:tasks){
            mp.put(i,mp.getOrDefault(i,0)+1);

        }
        // List<Integer> ls=new ArrayList<>(mp.keySet());
        int round=0;
        // System.out.println(mp);
        for(int i:mp.values()){
            System.out.print(i);
           if(i==1) return -1;
    
            // if(i%3==0) round+=i/3;
             round+=(i+2)/3;
        }
        return round;
    }
}
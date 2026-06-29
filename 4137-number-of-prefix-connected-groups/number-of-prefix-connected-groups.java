class Solution {
    public int prefixConnected(String[] words, int k) {
        Map<String,Integer> mp=new HashMap<>();
        for(String s:words){
            if(k<=s.length()){
            String st=s.substring(0,k);
            mp.put(st,mp.getOrDefault(st,0)+1);
            }

        }
        int ans=0;
        for(String s:mp.keySet()){

            if(mp.get(s)>=2) ans++;
        }
        return ans;
    }
}
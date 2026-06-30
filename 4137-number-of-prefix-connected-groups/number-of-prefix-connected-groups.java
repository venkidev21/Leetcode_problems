class Solution {
    public int prefixConnected(String[] words, int k) {
        Map<String,Integer> mp=new HashMap<>();
        for(String s:words){
            if(s.length()>=k){
                String t=s.substring(0,k);
            mp.put(t,mp.getOrDefault(t,0)+1);
            }
        }

        int ans=0;

        for(String s:mp.keySet()){
            if(mp.get(s)>1) ans++;
        }
        return ans;
    }
}
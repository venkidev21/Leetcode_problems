class Solution {
    public int longestPalindrome(String[] words) {
        Map<String,Integer> mp=new HashMap<>();
        int max=0;
        for(String s:words){
           String rev=s.charAt(1)+""+s.charAt(0);
            if(mp.containsKey(rev) && mp.get(rev)!=0){
                max+=4;
                // mp.remove(rev);
                mp.put(rev,mp.get(rev)-1);
                if(mp.get(rev)==0) mp.remove(rev);
            }   
            else mp.put(s,mp.getOrDefault(s,0)+1);
            // System.out.println(mp);
        }
        for(String s:mp.keySet()){
                if(s.charAt(0)==s.charAt(1)){
                 max+=2;
                 return max;
            }
        }
        return max;
    }
}
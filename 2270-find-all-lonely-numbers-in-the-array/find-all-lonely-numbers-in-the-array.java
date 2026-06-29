class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        List<Integer> ls=new LinkedList<>();
        for(int i:nums){
               mp.put(i,mp.getOrDefault(i,0)+1);
        } 
        for(int i:mp.keySet()){
            if(mp.get(i)>1 || mp.containsKey(i-1) || mp.containsKey(i+1)) continue;
            ls.add(i);
        }
        return ls;

        

    }
}
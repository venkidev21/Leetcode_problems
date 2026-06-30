class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        // Arrays.sort(nums);
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        List<Integer> ls=new LinkedList<>();
        for(int i:mp.keySet()){
            if(mp.containsKey(i+1) || mp.containsKey(i-1) || mp.get(i)>1) continue;
            ls.add(i);
        }
        return ls;
    }
}
class Solution {
    public String sortVowels(String s) {
        Map<Character,int[]> mp=new HashMap<>();
        int i=0;
        String vow="aeiou";
        for(char c:s.toCharArray()){
            if(vow.contains(c+"")){
                if(mp.containsKey(c)){
                    mp.get(c)[1]++;
                }
                else {
                    mp.put(c,new int[]{i,1});
                
                }
            }
            i++;
        }
        // System.out.println(mp.toString());
        // for(Character c:mp.keySet()){
        //     System.out.println(c+" "+Arrays.toString(mp.get(c)));
        // }
        PriorityQueue<Map.Entry<Character,int[]>> pq=new PriorityQueue<>((a,b)->{
            if(a.getValue()[1]==b.getValue()[1]) return a.getValue()[0]-b.getValue()[0];
            return b.getValue()[1]-a.getValue()[1];
        });
        pq.addAll(mp.entrySet());
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            char ch=pq.peek().getKey();
            for(i=0;i<mp.get(ch)[1];i++){
                sb.append(ch);
            }
            pq.poll();
        }
        i=0;
        StringBuilder rs=new StringBuilder();
        for(char c:s.toCharArray()){
            if(vow.contains(c+"")){
                rs.append(sb.charAt(i));
                i++;
            }
            else rs.append(c);

        }
        return rs.toString();
    }
}
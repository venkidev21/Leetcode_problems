class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String,Integer> mp=new HashMap<>();
        for(int i=0;i<senders.length;i++){
            String msg=messages[i];
            int c=(int)msg.chars().filter(t->t==' ').count();
            mp.put(senders[i],mp.getOrDefault(senders[i],0)+c+1);

        }
        int max=Integer.MIN_VALUE;
        String name=senders[0];
        for(String s:mp.keySet()){
            if(mp.get(s)>max){
                name=s;
                max=mp.get(s);
            }
            else if(mp.get(s)==max){
                if(name.compareTo(s)<0){
                    name=s;
                }
            }
        }
        return name;

        
    }
}
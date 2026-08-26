class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->{
            if(a.length()==b.length()){
                return a.compareTo(b); 
            }
            return Integer.compare( a.length(),b.length());
        });

        int c=0;
        int l=0;
        
        for(int r=0;r<s.length(); r++){
            if(s.charAt(r)=='1') c++;
           
            while(l<s.length() &&  c==k){
                  pq.add(s.substring(l,r+1));
                    if(s.charAt(l)=='1') c--;
                l++;
            }
           
        }
       
        //System.out.println(pq);
        if(pq.isEmpty()) return "";
        return pq.peek();
    }
}
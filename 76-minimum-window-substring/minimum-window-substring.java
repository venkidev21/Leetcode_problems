class Solution {
    public String minWindow(String s, String t) {
        int frq[]=new int[256];
        int tfrq[]=new int[256];
        for(char c:t.toCharArray()){
            tfrq[c-'0']++;
        }
        int l=0;
        if(s.equals(t)) return s;
        if(s.length()<t.length()) return "";
        int min=Integer.MAX_VALUE;
        String rs="";

        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            frq[c-'0']++;
            while(cheack(frq,tfrq)){
                if(min>r-l+1){
                min=r-l+1;
                rs=s.substring(l,r+1);
                }
                frq[s.charAt(l)-'0']--;
                l++;
                
            }
            //System.out.println(rs);
        }

            
        
        return rs;


    }

    boolean cheack(int[] arr,int[] t){
        for(int i=0;i<256;i++){
            if(t[i]!=0 && arr[i]<t[i]) return false;
        }
        return true;
    }
}
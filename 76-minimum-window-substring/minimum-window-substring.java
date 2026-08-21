class Solution {
    public String minWindow(String s, String t) {
        int arr[]=new int[256];
        int ml=0;
        int rl=s.length();
        String rs=s+s;
        int l=0;
        if(s.length()<t.length()) return "";
        for(char c:t.toCharArray()){
            arr[c]++;
        }

        int frq[]=new int[256];
        int r=0;
        while(r<s.length()){
            frq[s.charAt(r)]++;
            r++;
            while(chiech(arr,frq)){
                 String sub=s.substring(l,r);
                if(rs.length()>=sub.length()){
                    rs=sub;
                }
                 // System.out.println(sub);
                frq[s.charAt(l)]--;
                l++;
  
            }
  
        }
        // if(ml==-1 || rl==s.length()+1) return "";
        if(rs.length()>s.length()) return "";
        return rs;

    }
    boolean chiech(int arr1[],int arr2[]){
        for(int i=0;i<256;i++){
            if(arr1[i]!=0 && (arr1[i]>arr2[i])) return false;
        }
        return true;
    }
}
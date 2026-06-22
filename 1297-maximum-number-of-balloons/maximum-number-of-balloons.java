class Solution {
    public int maxNumberOfBalloons(String text) {
        int fre[]=new int[26];
        String s="balon";
        int min=Integer.MAX_VALUE;
        for(char c:text.toCharArray()){
            fre[c-'a']++;
        }
        // if(fre['l'-'a']%2!=0 || fre['o'-'a']%2!=0) return 0;
        if(fre['l'-'a']%2!=0) fre['l'-'a']--;
        if(fre['o'-'a']%2!=0) fre['o'-'a']--;
        fre['l'-'a']=fre['l'-'a']/2;
         fre['o'-'a']=fre['o'-'a']/2;
        for(char c:s.toCharArray()){
            
            
            min=Math.min(fre[c-'a'],min);
        }
        return min;
    }
}
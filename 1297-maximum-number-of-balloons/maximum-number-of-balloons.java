class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[]=new int[26];
        char st[]={'b','a','l','o','n'};
        for(char c:text.toCharArray()){
            arr[c-'a']++;
        }
        arr['l'-'a']/=2;
        arr['o'-'a']/=2;
        int min=Integer.MAX_VALUE;
        for(char c:st){
            min=Math.min(min,arr[c-'a']);
        }
        return min;
    }
}
class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int l = 0;
        int window = Integer.MIN_VALUE;

        for (char c : s.toCharArray()) {
            mp.put(c, 0);
        }
        for (int i = 0; i < s.length(); i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
            while (mp.get(s.charAt(i)) > 2) {
                mp.put(s.charAt(l), mp.getOrDefault(s.charAt(l), 0) - 1);
                l++;
            }
            // System.out.println(mp);
            boolean k = true;
            for (int c : mp.values()) {
               
                if (c > 2 ){
                    k = false;
                    break;
                }
            }
            if (k) {
                //System.out.println(l+" "+i);
                window = Math.max(window, i - l + 1);
            }
        }
        return window;

    }
}
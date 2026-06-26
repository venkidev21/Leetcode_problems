class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        // xor of all element in derived is 0 true
        int xor=0;
        for(int i:derived){
            xor^=i;
        }
        return xor==0;
    }
}
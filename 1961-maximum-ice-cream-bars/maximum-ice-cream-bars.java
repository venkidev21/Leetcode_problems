class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=0;
        Arrays.sort(costs);
        int coin=coins;
        for(int i:costs){
            if(coin-i>=0){
                max++;
                coin-=i;
            }
            else break;
        }
        return max;
    }
}
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if(need1==0 && need2==0 ) return 0;

        if(cost1+cost2<=costBoth) return ((long)cost1*need1)+((long)cost2*need2);

        long min=Math.min(need1,need2);

        long comboMin=(long)costBoth*min+(long)(need1-min)*cost1+(long)(need2-min)*cost2;

        long Max=Math.max(need1,need2);

        long comboMax=(long)costBoth*Max;

        return Math.min(comboMin,comboMax);

    }
}
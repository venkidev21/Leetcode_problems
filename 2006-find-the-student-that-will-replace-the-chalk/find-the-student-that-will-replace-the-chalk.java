class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i=0;
        while(k>=chalk[i]){
            k-=chalk[i];
            i++;
            if(i==chalk.length) i=0;
        }
        return i;
    }
}
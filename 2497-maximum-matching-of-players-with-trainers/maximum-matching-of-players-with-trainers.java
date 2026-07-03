class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int a1=players.length-1;
        int a2=trainers.length-1;
        int ans=0;
        while(a1>=0 && a2>=0){
            if(players[a1]>trainers[a2]) a1--;
            else {
                ans++;
                a1--;
                a2--;
            }
        }
        return ans;
    }
}
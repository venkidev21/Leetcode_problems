class Solution {
public:
    int matchPlayersAndTrainers(vector<int>& players, vector<int>& trainers) {
        sort(players.begin(),players.end());
        sort(trainers.begin(),trainers.end());
        int ans=0;
        int a1=players.size()-1;
        int a2=trainers.size()-1;
        while(a1>=0 && a2>=0){
            if(players[a1]>trainers[a2]) a1--;
            else{
                ans++;
                a1--;
                a2--;
            }
        }
        return ans;


    }
};
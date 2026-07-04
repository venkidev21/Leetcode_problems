class Solution {
public:
    int maximumBags(vector<int>& capacity, vector<int>& rocks, int additionalRocks) {
        vector<int> cap;
        for(int i=0;i<capacity.size();i++){
            cap.push_back(capacity[i]-rocks[i]);
        }
        sort(cap.begin(),cap.end());
        int res=0;
        for(int i=0;i<cap.size();i++){
            if(cap[i]==0) res++;
            else if(additionalRocks>=cap[i]){
                res++;
                additionalRocks-=cap[i];
            }
            else 
                return res;
        }
        return res;


    }
};
class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            ls.add(new ArrayList<>());
        }

        for(int nd[]:roads){
            ls.get(nd[0]).add(nd[1]);
            ls.get(nd[1]).add(nd[0]);
        }
        // int max=0;
        // System.out.println(ls);
    
        // for(int i=0;i<n;i++){
        //     int l=ls.get(i).size();
        //     for(int j:ls.get(i)){
                
        //         max=Math.max(max,l+ls.get(j).size()-1);
        //     }
        // }

      

        // int max=-1,SecondMax=-1;
        // int mi=-1,si=-1;
        //  int res=0;
        // for(int i=0;i<n;i++){
        //     if(ls.get(i).size()>=max){
        //         SecondMax=max;
        //         max=ls.get(i).size();
        //         si=mi;
        //         mi=i;
        //     }
        //     else if(ls.get(i).size()>=SecondMax){
        //         SecondMax=ls.get(i).size();
        //         si=i;
        //     }
          
        //     if(si!=-1){
        //           int comm=ls.get(mi).contains(si)?1:0;
        //             comm=ls.get(si).contains(mi)?1:0;
        //         res=Math.max(res,max+SecondMax-comm);
        //     }
        // }
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int currRank=ls.get(i).size()+ls.get(j).size();

                if(ls.get(i).contains(j)) currRank--;

                res=Math.max(currRank,res);
            }
        }
        return res;
    }
}
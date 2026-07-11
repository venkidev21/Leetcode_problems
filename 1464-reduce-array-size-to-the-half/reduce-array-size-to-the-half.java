class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int buket[]=new int[arr.length+1];   
        // buket sorting
        for(int key:mp.keySet()){
            buket[mp.get(key)]++;
        } 
       int remove=0;
       int n=arr.length;
       int count=0;
       System.out.println(Arrays.toString(buket));
        for(int i=buket.length-1;i>=0;i--){
            while(buket[i]>0){
                remove+=i;
                buket[i]--;
                count++;
                if(remove>=n/2) break;
            }
            if(remove>=n/2) break;
        }
        return count;


    }
}
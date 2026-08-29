class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            if(Math.abs(a-x)!=Math.abs(b-x)){
                return Math.abs(a-x)-Math.abs(b-x);
            }
            return a-b;
        });
        for(int i:arr){
            pq.add(i);
        }
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<k;i++){
            ls.add(pq.poll());
        }
        Collections.sort(ls);
        return ls;
    }
}
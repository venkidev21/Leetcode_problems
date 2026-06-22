class RideSharingSystem {
    Queue<Integer> rid;
    Queue<Integer> dri;
    public RideSharingSystem() {
        rid=new LinkedList<>();
        dri=new LinkedList<>();
    }
    
    public void addRider(int riderId) {
        rid.add(riderId);
    }
    
    public void addDriver(int driverId) {
        dri.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        int r=-1;
        int d=-1;
        if(!rid.isEmpty() && !dri.isEmpty()){
            r=rid.poll();
             d=dri.poll();
        }
        
           
      
        return new int[]{d,r};
    }
    
    public void cancelRider(int riderId) {
        if(!rid.isEmpty()){
            rid.remove(riderId);
        }
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */
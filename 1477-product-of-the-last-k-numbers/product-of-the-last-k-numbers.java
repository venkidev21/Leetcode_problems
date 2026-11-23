class ProductOfNumbers {
    List<Integer> ls;
    int size;
    public ProductOfNumbers() {
        ls=new ArrayList<>();
        size=0;
        ls.add(1);

    }
    
    public void add(int num) {
        if(num==0) {
            ls=new ArrayList<>();
            size=0;
            ls.add(1);
        }
        else{
            ls.add(ls.get(size)*num);
            size++;
        }
    }
    
    public int getProduct(int k) {
        if(k>size) return 0;

        return ls.get(size)/ls.get(size-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
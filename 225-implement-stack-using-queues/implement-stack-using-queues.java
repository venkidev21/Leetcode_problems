class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();

    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        int top;
        while(!q1.isEmpty()){
            top=q1.remove();
            q2.add(top);
        }
        top=q2.remove();
        while(!q2.isEmpty()){
           
            q1.add( top);
            top=q2.remove();
        }
        return top;

    }
    
    public int top() {
        int top=q1.peek();
        while(!q1.isEmpty()){
            top=q1.remove();
            q2.add(top);
        }
        
        while(!q2.isEmpty()){
           
            q1.add( q2.remove());
            
        }
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.remove();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
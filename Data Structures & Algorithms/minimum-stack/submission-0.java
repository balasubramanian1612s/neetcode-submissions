class MinStack {

    Stack<Integer> stk;
    Stack<Integer> minStk;

    public MinStack() {
        stk = new Stack<>();
        minStk = new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(!minStk.empty()){
            if(minStk.peek()>val){
                minStk.push(val);
            } else{
                minStk.push(minStk.peek());
            }
        } else {
            minStk.push(val);
        }
    }
    
    public void pop() {
        stk.pop();
        minStk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minStk.peek();
    }
}

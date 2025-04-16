class MinStack {
    int top ;
    int stk_len = 10000;
    int [] stk;
    int min ;

    public MinStack() {
        top = -1;
        stk = new int[stk_len];
        min =Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(top+1 < stk_len){
            top++;
            stk[top] = val;
            min = Math.min(min,val);
        }
        
    }
    
    public void pop() {
       if(top>=0){
        int popped = stk[top--];
        if(popped == min){
        min =Integer.MAX_VALUE;
        for(int i = 0;i<=top;i++){
            min = Math.min(min,stk[i]); 
        }
        }
       }
    }
    
    public int top() {
        return stk[top];
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
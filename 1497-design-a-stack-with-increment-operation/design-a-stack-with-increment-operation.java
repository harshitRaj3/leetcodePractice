class CustomStack {
    int []stack;
    int[]inc;
    int top;
    int maxSize;
    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
        stack=new int[maxSize];
        inc=new int[maxSize];
        top=-1;
    }
    
    public void push(int x) {

        if(top+1==maxSize)return;
            
        
                stack[top+1]=x;
                top++;

        
        
    }
    
    public int pop() {
        if(top==-1) return -1;
        int res=stack[top]+inc[top];
        if(top!=0){
            inc[top-1]+=inc[top];
        }
            inc[top]=0;
            top--;
           
        
         return res;
        
    }
    
    public void increment(int k, int val) {
        int idx=Math.min(k-1,top);
        if(idx>=0){
            inc[idx]+=val;
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
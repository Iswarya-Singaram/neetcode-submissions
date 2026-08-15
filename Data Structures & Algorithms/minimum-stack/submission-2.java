class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> m;

    public MinStack() {
        s = new Stack<>();
        m = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(m.isEmpty() || val<=m.peek())
        m.push(val);
    }
    
    public void pop() {
        if (s.isEmpty()) return;
        int e = s.pop();
        if(!m.isEmpty() && e == m.peek())
        m.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return m.peek();
    }
}

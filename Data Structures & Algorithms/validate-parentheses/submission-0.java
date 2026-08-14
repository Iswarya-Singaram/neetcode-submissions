class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character , Character> m = new HashMap<>();
        m.put(')','(');
        m.put('}','{');
        m.put(']','[');
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(m.containsKey(c)){
                if(!st.isEmpty() && st.peek() == m.get(c))
                st.pop();
                else
                return false;
            }
            else
            st.push(c);
        }
        return st.isEmpty();
    }
}

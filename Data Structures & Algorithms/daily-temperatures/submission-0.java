class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> s = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            int t = temperatures[i];
            while(!s.isEmpty() && t>s.peek()[0]){
                int[] pairs = s.pop();
                res[pairs[1]] = i-pairs[1];
            }
            s.push(new int[]{t,i});
        }
        return res;
    }
}

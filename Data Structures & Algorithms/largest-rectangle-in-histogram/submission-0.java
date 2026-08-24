class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int max_a = 0;
        int n = heights.length;
        for(int i=0;i<=n;i++){
            while(!s.isEmpty() && (i==n || heights[s.peek()]>=heights[i])){
                int h = heights[s.pop()];
                int w = s.isEmpty() ? i : i-s.peek()-1;
                max_a = Math.max(max_a , h*w);
            }
            s.push(i);
        }
        return max_a;
    }
}

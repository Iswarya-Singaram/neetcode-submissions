class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1;
        int m_a =0;
        while(l<r){
            int a = (r-l)*Math.min(heights[l],heights[r]);
            if(heights[l]<=heights[r])
            l++;
            else
            r--;
            m_a = Math.max(m_a,a);
        }
        return m_a;
    }
}

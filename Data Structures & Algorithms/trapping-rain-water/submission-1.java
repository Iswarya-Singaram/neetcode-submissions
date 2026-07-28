class Solution {
    public int trap(int[] height) {
        if(height == null || height.length ==0) return 0;
        int res=0;
        int  l=0,r=height.length-1;
                int max_l= height[l], max_r=height[r];
        while(l<r){
            if(height[l]<=height[r]){
                l++;
                max_l = Math.max(max_l , height[l]);
                res+=max_l-height[l];
            }
            else{
                r--;
                max_r = Math.max(max_r,height[r]);
                res+=max_r-height[r];
            }
        }
        return res;
    }
}

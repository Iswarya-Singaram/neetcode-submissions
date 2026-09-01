class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int res=Integer.MAX_VALUE;
        int l=1, r = piles[piles.length-1];
        while(l<=r){
            int s=0;
            int m = l+(r-l)/2;
            for(int x : piles){
                s+=(x + m - 1) / m;
            }
            if(s<=h){
            res = Math.min(res,m);
            r = m-1;
            }
            else if(s>h){
                l= m+1;
            }
        }
        return res;
    }
}

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int l=1, r = max;
        int res = max;
        while(l<=r){
            int s=0;
            int m = l+(r-l)/2;
            for(int x : piles){
                s+=Math.ceil((double)x/m);
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

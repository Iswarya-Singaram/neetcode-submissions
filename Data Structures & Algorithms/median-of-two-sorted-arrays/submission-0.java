class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = nums1;
        int[] B = nums2;
        int total = A.length + B.length;
        int h = (total + 1)/2;
        if(A.length > B.length){
            int[] temp = B;
            B = A;
            A = temp;
        }
        int l=0,r = A.length;
        while(l<=r){
            int i = (l+r)/2;
            int j = h - i;
            int Al = (i>0)?A[i-1]:Integer.MIN_VALUE;
            int Ar = i<A.length? A[i]: Integer.MAX_VALUE;
            int Bl = j>0 ?B[j-1] : Integer.MIN_VALUE;
            int Br = j<B.length ? B[j] : Integer.MAX_VALUE;
            if(Al <= Br && Bl <= Ar){
                if(total%2==0)
                return ((double)Math.max(Al, Bl) + Math.min(Ar,Br))/2;
                else
                return Math.max(Al,Bl);
            }
            else if(Al>Br)
            r = i-1;
            else
            l = i+1;
        }
        return -1;
    }
}

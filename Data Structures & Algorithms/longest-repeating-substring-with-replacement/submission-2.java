public class Solution {
    public int characterReplacement(String s, int k) {
        int res =0,l=0,maxf=0;
        HashMap<Character , Integer > c = new HashMap<>();
        for(int r=0;r<s.length();r++){
            c.put(s.charAt(r),c.getOrDefault(s.charAt(r),0)+1);
            maxf = Math.max(maxf,c.get(s.charAt(r)));
            while((r-l+1)-maxf>k){
                c.put(s.charAt(l),c.get(s.charAt(l))-1);
                l++;
            }
            res = Math.max(res,r-l+1);

        }
        return res;
    }
}
class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) return "";
        HashMap<Character,Integer> ct = new HashMap<>();
        HashMap<Character, Integer> w = new HashMap<>();
        for(char i:t.toCharArray())
        ct.put(i,ct.getOrDefault(i,0)+1);
        int[] res = {-1,-1};
        int reslen = Integer.MAX_VALUE;
        int l=0,need=ct.size(),have =0;
        for(int r=0;r<s.length();r++){
            w.put(s.charAt(r),w.getOrDefault(s.charAt(r),0)+1);
            if(ct.containsKey(s.charAt(r)) && w.get(s.charAt(r)).equals(ct.get(s.charAt(r)))){
                have++;
            }
            while(have == need){
                if(r-l+1 < reslen){
                    reslen = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }
                    w.put(s.charAt(l),w.getOrDefault(s.charAt(l),0)-1);
                    if(ct.containsKey(s.charAt(l)) && w.get(s.charAt(l))< ct.get(s.charAt(l)))
                    have--;
                l++;
            }
            }
                    return reslen == Integer.MAX_VALUE ? "": s.substring(res[0],res[1]+1);
        }
}

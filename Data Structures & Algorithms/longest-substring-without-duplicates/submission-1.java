class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> w = new HashSet<>();
        int max_l=0,l=0;
        for(int i=0;i<s.length();i++){
            while(w.contains(s.charAt(i))){
                w.remove(s.charAt(l));
                l++;
            }
            w.add(s.charAt(i));
            max_l = Math.max(max_l, w.size());
        }
        return max_l;
    }
}

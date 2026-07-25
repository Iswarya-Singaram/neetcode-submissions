class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int x: nums){
            s.add(x);
        }
        int longest =0;
        for(int x: s){
            if(!s.contains(x-1)){
            int l=1;
            while(s.contains(x+l)){
                l++;
            }
            longest = Math.max(longest,l);
        }
        }
        return longest;
    }
}

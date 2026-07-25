class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(clean);
        sb.reverse();
        String s1 = sb.toString();
        if(clean.equals(s1))
        return true;
        return false;
    }
}

class Solution {
    public int findDuplicate(int[] nums) {
        int s1 = 0, f =0;
        for(int i:nums){
            s1 = nums[s1];
            f = nums[nums[f]];
            if(s1==f)
            break;
        }
        int s2 =0;
        for(int i:nums){
            s2 = nums[s2];
            s1 = nums[s1];
            if(s1 == s2)
            return s1;
        }
        return -1;
    }
}

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close= Integer.MAX_VALUE;
        int val=0;
        for(int  i=0;i<nums.length;i++){
                    int  l=i+1,r=nums.length-1;
        while(l<r){
            int cur=nums[i]+nums[l]+nums[r];
            if(close>Math.abs(cur-target)){
                close = Math.abs(cur-target);
                val = cur;
            }
            if(cur<target){
                l++;
            }
            else if(cur>target){
                r--;
            }
            else{
                return target;
            }
        }
        }
        return val;
    }
}

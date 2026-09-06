class Solution {

    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        // Find pivot (smallest element)
        while (l < r) {

            int m = l + (r - l) / 2;

            if (nums[m] > nums[r])
                l = m + 1;
            else
                r = m;
        }

        int p = l;

        // Search left half
        int res = b_s(nums, target, 0, p - 1);

        if (res != -1)
            return res;

        // Search right half
        return b_s(nums, target, p, nums.length - 1);
    }


    public int b_s(int[] arr, int t, int l, int r) {

        while (l <= r) {

            int m = l + (r - l) / 2;

            if (arr[m] == t)
                return m;

            else if (arr[m] < t)
                l = m + 1;

            else
                r = m - 1;
        }

        return -1;
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + ((r - l) / 2);
            if (nums[m] < nums[r]) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        if (r == 0) {
            return bSearch(nums, 0, nums.length - 1, target);
        }
        int leftR = bSearch(nums, 0, r - 1, target);
        int rightR = bSearch(nums, r, nums.length - 1, target);
        if (leftR != -1) {
            return leftR;
        } else if (rightR != -1) {
            return rightR;
        }
        return -1;
    }

    private int bSearch(int[] nums, int l, int r, int t) {
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == t) {
                return m;
            } else if (nums[m] > t) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
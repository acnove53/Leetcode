class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target || nums[r] == target || nums[l] == target) {
                return true;
            }
            if (nums[r] == nums[m] && nums[l] == nums[m]) {
                l++;
                r--;
            } else if (nums[l] <= nums[m]) { //left half is sorted
                if (nums[l] <= target && target <= nums[m]) {
                    r = m;
                } else {
                    l = m + 1;
                }
            } else { //right half is sorted
                if (nums[m] <= target && target <= nums[r]) {
                    l = m;
                } else {
                    r = m - 1;
                }
            }
        }
        return false;
    }
}
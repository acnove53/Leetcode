class Solution {
    public int longestOnes(int[] nums, int k) {
        if (nums.length == 0) {
            return 0;
        }
        int l = 0;
        int maxf = 0;
        int res = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 1) {
                maxf++;
            }
            if (r - l + 1 - maxf > k) {
                if (nums[l] == 1) {
                    maxf--;
                }
                l++;
            }
            if (r - l + 1 > res) {
                res = r - l + 1;
            }
        }
        return res;
    }
}
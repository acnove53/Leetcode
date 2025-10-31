class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] pref = new int[nums.length]; // [1,2,6,24]   [1,1 2,1 2 3,1 2 3 4]
        int [] suff = new int[nums.length]; // [4,12,24,24] [4,4 3, 4 3 2, 4 3 2 1]
        int l = nums.length - 1;            // [1,2,3,4]
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                pref[i] = nums[i];
                suff[i] = nums[l];
            } else {
                pref[i] = pref[i - 1] * nums[i];
                suff[i] = suff[i - 1] * nums[l - i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (l - i == 0) {
                nums[i] = pref[i - 1];
            } else if (i - 1 < 0) {
                nums[i] = suff[l - 1];
            } else {
                nums[i] = suff[l - 1 - i] * pref[i - 1];
            }
        }
        return nums;
    }
}
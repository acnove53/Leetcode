class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0, r = 0;
        int maxf = 0, res = 0;
        
        while (r < nums.length) {
            if (nums[r] == 1) {
                r++;
                maxf++;
                if (maxf > res) {
                    res = maxf;
                }
            } else {
                r++;
                l = r;
                maxf = 0;
            }
        }
        return res;
        
    }
}
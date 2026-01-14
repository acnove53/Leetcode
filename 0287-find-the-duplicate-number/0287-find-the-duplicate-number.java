class Solution {
    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] < 0) {
                return Math.abs(nums[i]);
            }
            nums[Math.abs(nums[i]) - 1] *= -1;
        }
        return -1;

        // Set<Integer> set = new HashSet<>();
        // for (int elem : nums) {
        //     if (set.contains(elem)) {
        //         return elem;
        //     }
        //     set.add(elem);
        // }
        // return -1;
    }
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        // [1 2 3 4] n = 6
        // 6 - 1 = 5
        // 6 - 4 = 2
        while (numbers[l] + numbers[r] != target) {
            while (target - numbers[l] < numbers[r]) {
                r--;
            }
            while (target - numbers[r] > numbers[l]) {
                l++;
            }
        }
        int[] result = {l + 1, r + 1};
        return result;
    }
}
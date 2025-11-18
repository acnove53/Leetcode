class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;
        while (i < j) {
            if (height[i] < height[j]) {
                height[i] = height[i] * (j - i);
                if (height[i] > max) {
                    max = height[i];
                }
                i++;
            } else {
                height[j] = height[j] * (j - i);
                if (height[j] > max) {
                    max = height[j];
                }
                j--;
            }
        }
        return max;
    }
}
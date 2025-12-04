class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] maxL = new int[len];
        int[] maxR = new int[len];
        int max = height[0];
        maxL[0] = max;
        for (int l = 1; l < len; l++) {
            if (max < height[l]) {
                max = height[l];
            }
            maxL[l] = max;
        }
        max = height[len - 1];
        maxR[len - 1] = max;
        for (int r = len - 2; r >= 0; r--) {
            if (max < height[r]) {
                max = height[r];
            }
            maxR[r] = max;
        }
        
        max = 0;
        for (int i = 0; i < len; i++) {
            height[i] = Math.min(maxL[i], maxR[i]) - height[i];
            if (i != 0 && i != len - 1 && height[i] > 0) {
                max += height[i];
            }
        }
        return max;
        /**
        for (int i = 0; i < height.length; i++) {
            int l = i, r = i;
            int trap = Math.min(height[l], height[r]) - height[i];
            height[i] = 
        } */
    }
}
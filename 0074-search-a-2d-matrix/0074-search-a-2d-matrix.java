class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix.length - 1;
        int l = 0, r = matrix[0].length - 1;
        int row = -1;

        while (i <= j) {
            int mid = ((j - i)/ 2) + i;
            if (matrix[mid][l] > target) {
                j = mid - 1;
            } else if (matrix[mid][r] < target) {
                i = mid + 1;
            } else {
                row = mid;
                break;
            }
        }

        while (l <= r) {
            int mid = (r - l / 2) + l;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return false;
    }
}
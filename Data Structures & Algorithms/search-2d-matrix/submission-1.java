class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int k = 0; k < m; k++) {
            if(target > matrix[k][n-1]) continue;
            int i = 0;
            int j = n - 1;
            while (i <= j) {
                int mid = i + (j - i) / 2;
                if (matrix[k][mid] == target)
                    return true;
                else if (matrix[k][mid] > target)
                    j = mid - 1;
                else
                    i = mid + 1;
            }
        }
        return false;
    }
}

// class Solution {
//     public boolean searchMatrix(int[][] arr, int target) {
//         int left =0;
//         int n = arr.length;
//         int m = arr[0].length;
//         int right = n*m -1;
//         while(left <= right){
//             int mid = left +(right -left/2);
//             int midValue = arr[mid/m][mid%m];
//         if(midValue == target){
//                 return true;
//             }
//             else if(midValue <target){
//                 left = mid+1;
//             }
//             else{
//                 right = mid-1;
//             }
//         }
//         return false;
//     }
// }
//2nd operation:
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        // 1. Binary search to find the correct row
        int top = 0;
        int bottom = m - 1;
        int targetRow = -1;

        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;
            if (matrix[mid][0] <= target && target <= matrix[mid][n - 1]) {
                targetRow = mid;
                break;
            } else if (matrix[mid][0] > target) {
                bottom = mid - 1;
            } else {
                top = mid + 1;
            }
        }

        if (targetRow == -1) {
            return false;
        }

        // 2. Binary search within the identified row
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[targetRow][mid] == target) {
                return true;
            } else if (matrix[targetRow][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
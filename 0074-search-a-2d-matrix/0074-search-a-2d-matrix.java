class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int left =0;
        int n = arr.length;
        int m = arr[0].length;
        int right = n*m -1;
        while(left <= right){
            int mid = left +(right -left/2);
            int midValue = arr[mid/m][mid%m];
            if(midValue == target){
                return true;
            }
            else if(midValue <target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return false;
    }
}
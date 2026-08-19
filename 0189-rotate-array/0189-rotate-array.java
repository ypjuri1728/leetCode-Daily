class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       k = k %n;
//        k-n-> works if k is less than 2n
// k%n -> works for ANY k
// n rotations = original array/

        reverse(nums,0,n-1); //whole array rev
        reverse(nums, 0, k - 1); //1st part 
        reverse(nums, k, n - 1); //2nd part
         
    }
    public void reverse(int[] nums,int left,int right){
        while(left <right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
//     k = n  -> same array
// k = n + 1   -> 1 rotation
// k = n + 2 -> 2 rotations
// k = 2n  -> same array
// k = 2n + 3  -> 3 rotations
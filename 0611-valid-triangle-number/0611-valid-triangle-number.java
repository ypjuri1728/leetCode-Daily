class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        int n = nums.length;
        // Fix the largest side from right to left
        for(int i =n-1;i >=2;i--) {//last to top run
        int left =0;
        int right = i-1;
        while(left <right){
               // Triangle condition: a + b > c
            if(nums[left] + nums[right] >nums[i]){
                 // All values between left and right
            // can form a triangle with nums[right] and nums[i]
                count += right-left;
                right--;// Try a smaller right side
            }
            else{
                left++;// Sum is too small, increase left
            }
        }
    }
    return count;
}
}
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            int mid = left+(right-left)/2;
            if(nums[mid]> nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }
}
// nums[mid] > nums[right] --> Minimum is RIGHT of mid --> left = mid + 1
//nums[mid] <= nums[right] --> Minimum is LEFT of mid OR at mid --> right = mid
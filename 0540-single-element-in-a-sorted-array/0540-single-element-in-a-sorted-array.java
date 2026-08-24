class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left <right){
            int mid = left+(right-left)/2;
            if(mid%2 != 0){
                mid--; //odd
            }
            if(nums[mid] == nums[mid+1]){
                left = mid+2; //after num
            }
            else{
                right = mid;//before 
            }
        }
    return nums[left];
    }
}
// [1,1,2,3,3,4,4,8,8] -->check middle
// [1,1,2,3,3] | [4,4,8,8] -->check middle again
// [1,1] | [2,3,3] --> [1,1] | [2] --> 2
// nums[mid] == nums[mid+1]
//         ↓
//    pair is correct
//         ↓
//    single is RIGHT


// nums[mid] != nums[mid+1]
//         ↓
//    pair is broken
//         ↓
//    single is LEFT
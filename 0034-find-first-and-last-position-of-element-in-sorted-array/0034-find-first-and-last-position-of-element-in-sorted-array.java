class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
           
            int left =0;
            int right = n-1;
            while(left <=right){
                int mid = left+(right-left)/2;
                if(nums[mid] == target){
                    int first = mid;
                    int last =mid;
                
                while(first >0 && nums[first-1] == target){
                    first--;
                }
                while(last <n-1 && nums[last+1]==target){
                    last++;
                }
                return new int[]{first,last};
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
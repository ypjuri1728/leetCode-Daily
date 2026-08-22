class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        //closest remembers the best/nearest sum found so far.  
        int closest = nums[0] +nums[1]+ nums[2];
        for(int i =0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left <right){
                //sum is only the current triplet's sum.
                int sum = nums[i] + nums[right] + nums[left];
                if(Math.abs(sum-target) < Math.abs(closest- target)){
                    closest = sum;
                }
                //If the current sum is closer to target than closest, replace closest
                if(sum <target) {
                    left++;
                }
                else if(sum>target){
                    right--;
                }
                else{
                    return sum;
                }
            }
        }
        return closest;
    }
}
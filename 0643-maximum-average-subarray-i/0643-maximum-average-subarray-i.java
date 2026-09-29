class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;
        int maxi = Integer.MIN_VALUE;
        int left =0;
        for(int right =0;right<nums.length;right++){
            sum += nums[right];
            if(right -left+1 == k){
               maxi= Math.max(maxi,sum);
               sum -= nums[left];
               left++;
            }
        }
        return maxi*1.0/k ;
    }
}
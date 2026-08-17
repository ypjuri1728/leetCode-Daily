class Solution {
    private boolean isPossible(int mid, int[] nums, int threshold){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]/mid);
            if(nums[i]%mid !=0) sum++;
            if(sum>threshold) return false;
        }
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int ans  =0;
        int low=1;
        int high = 0;
        for(int i = 0;i<nums.length;i++){
            high = Math.max(high,nums[i]);
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            if(isPossible(mid,nums,threshold)){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;
    }
}
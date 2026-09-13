class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        int n =nums.length;
        for(int j =1;j<n;j++){
            if(nums[j] != nums[i]){
                    i++;
                    nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
// j -> searches
// i -> stores unique values
// i++ -> next empty unique position
// nums[i] = nums[j] -> copy unique value
// i+1 -> total unique count
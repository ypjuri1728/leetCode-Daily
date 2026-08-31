class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] != val){//we only want that num what is in array 
                nums[k] = nums[i];//store that num what is not == val
                k++;
            }
        }
        return k;
    }
}
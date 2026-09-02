class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int i =0;
        int j =1;
        int count =0;
      

        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] == nums[i - 1]) {
        //         count++;
        //         break;   // only one unique pair needed here
        //      }
        // }
        while(j <nums.length){
        if(i ==j){
            j++;
            continue;
            
        }
        int diff = nums[j]-nums[i];

        if(diff== k){
            count++;
        
        int left = nums[i];
        int right = nums[j];
        while (i<nums.length&& nums[i] == left){
            i++;
        }
        while(j<nums.length && nums[j] == right){
            j++;
        }
        }
        else if(diff<k){
            j++;
        }
        else{
            i++;
        }
        }
            return count;
    }
}
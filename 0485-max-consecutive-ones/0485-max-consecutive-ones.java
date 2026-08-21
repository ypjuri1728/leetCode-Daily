class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_c = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max_c = Math.max(max_c, count);
            } else {
                count = 0;
            }
        }

        return max_c;
    //     int maxcount =0;
    //     for(int i =0;i<nums.length;i++){
    //         int count =0;
    //         for(int j =i;j<nums.length;j++){
    //             if(nums[j] == 1){
    //             count++;
    //             maxcount = Math.max(count,maxcount);
    //         }
    //         else{
    //             count =0;
    //         }
    //     }
    // }
    // return maxcount;
}
}

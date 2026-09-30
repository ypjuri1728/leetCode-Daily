class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        //bf pattern
    //     int minLen = Integer.MAX_VALUE;
    //     for(int start =0;start<nums.length;start++){
    //         int currSum =0;
    //         for(int end =start;end<nums.length;end++){
    //             currSum += nums[end];
    //             if(currSum >= target){
    //                 minLen  = Math.min(minLen,end-start+1);
    //                 break;
    //             }
    //       } 
    //     }
    //     if(minLen == Integer.MAX_VALUE) return 0;
    //  return minLen;  

//sw pattern
int start =0;
int sum =0;
int minLen = Integer.MAX_VALUE;
for(int end =0; end<nums.length;end++){
    sum += nums[end];
    while(sum >= target){
        minLen = Math.min(minLen,end-start+1);
        sum -= nums[start++];      
    }
}
if(minLen == Integer.MAX_VALUE) return 0;
return minLen;
    }
    }
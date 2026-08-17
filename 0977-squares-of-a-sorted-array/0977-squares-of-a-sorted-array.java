class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
       int start=0;
       int end = n-1;
       int []res=new int [n];
        for(int i =n-1;i>=0;i--){
            if(Math.abs(nums[start])>Math.abs(nums[end])){
                res[i] = nums[start]*nums[start];
                start++;
            }
           else {
                res[i] = nums[end] * nums[end];
                end--;
            }
        }
        return res;
    }
}
        
//abs num ->-ve convert to +ve
//Arrays.sort(nums); (nlogn time complexity)
      
    
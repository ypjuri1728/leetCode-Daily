class Solution {
    public int maxWidthRamp(int[] nums) {
       int n = nums.length;
       int[][] arr = new int[n][2];
    
       for(int k =0;k<n;k++){
        arr[k][0]=nums[k];
        arr[k][1]=k;//index

       }
         Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int minIndex = n;
        int ans = 0;
        for (int i =0;i<n; i++) {
            minIndex = Math.min(minIndex,arr[i][1]); //index check and work on to search min
            ans = Math.max(ans, arr[i][1]-minIndex);
        }
        return ans;
    }
}
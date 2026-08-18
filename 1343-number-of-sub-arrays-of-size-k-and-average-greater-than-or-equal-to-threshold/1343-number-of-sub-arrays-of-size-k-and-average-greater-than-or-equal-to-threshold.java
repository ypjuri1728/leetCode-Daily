class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;//sum of the current window.
        int count = 0; //how many valid subarrays we found.
        for (int i = 0; i < k; i++) { // First window
            sum += arr[i];
        }
        if (sum >= k * threshold) {
            count++;
        }

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            //old sum - removed element + new element
            sum = sum - arr[i - k]; //L remove
            sum = sum + arr[i];//R add
        // sum = sum - oldLeft + newRight;
            
            //again check 
            if (sum >= k * threshold) { // sum/k >= thresholdd
                count++;
            }
        }
        return count;
    }
}
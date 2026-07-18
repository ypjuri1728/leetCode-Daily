class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1; //last valid num in nums1
        int j = n-1;  //last ele in num2
        int k = m+n-1; // last index for sure zeros to replace

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
//f j >= 0, copy the remaining elements of nums2 because they haven't been placed into nums1 yet.
// If i >= 0, do nothing because those elements are already sitting in the correct place inside nums1.
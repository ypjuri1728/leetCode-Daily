class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
    //     int maxi =Integer.MIN_VALUE;
    // for(int i =0;i<nums1.length;i++){
    //     for(int j =0;j<nums2.length;j++){
    //         if(nums1[i] <= nums2[j]){
    //             maxi = Math.max(maxi,j-i);
    //         }
    //     }
    // }
    //     return maxi;

    int i =0;
    int j =0;
    int maxDis =0;
    while(i <nums1.length && j <nums2.length){
        if(nums1[i] <=nums2[j]){
            maxDis = Math.max(maxDis,j-i);
            j++;
        }
        else{
            i++; //nums1[i] is to big so..
        }
    }
    return maxDis;
    }
}
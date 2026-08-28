class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length) {
return findMedianSortedArrays(nums2, nums1);// call function again for min length array 
        }
        int n = nums1.length;//left array size
        int m = nums2.length;//rigth array size

        int low=0;//left is small alwyas
        int high =n; //nums1 is the smaller array.

        while(low<=high){
            int px= low+(high-low)/2;
            int py =  (m+n+1)/2-px;  // to make eaiser

            //left partition
            int x1= (px ==0)? Integer.MIN_VALUE:nums1[px-1];
            int x2 = (py ==0)? Integer.MIN_VALUE:nums2[py-1];

            //right partiton
            int x3 =(px ==n)? Integer.MAX_VALUE:nums1[px];
            int x4 =(py ==m)? Integer.MAX_VALUE:nums2[py];



    if(x1<= x4 && x2<= x3){
        //odd
        if((m+n) % 2 ==1){
            return Math.max(x1,x2);
        }
        //even
        else{
            return (Math.max(x1,x2)+Math.min(x3,x4))/2.0;
        }
    }
    if(x1>x4){
        high = px-1;
    }
    else{
        low= px+1;
    }
        }

        return -1;
    }
}
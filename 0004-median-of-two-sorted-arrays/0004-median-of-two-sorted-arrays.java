class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;
        //Compare both
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                list.add(nums1[i]);
                i++;
            } else {
                list.add(nums2[j]);
                j++;
            }
        }
        //  nums1 may have leftovers
        while (i < nums1.length) {
            list.add(nums1[i]);
            i++;
        }
        //  nums2 may have leftovers
        while (j < nums2.length) {
            list.add(nums2[j]);
            j++;
        }

        int n = list.size();
        if (n % 2 == 0) {
            // EVEN → two middle elements
            return (list.get(n / 2 - 1) + list.get(n / 2)) / 2.0;
        }
        // ODD → one middle element
        return list.get(n / 2);
    }
}
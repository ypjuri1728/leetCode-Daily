class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int k = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < m; i++) {
            map.put(nums2[i], map.getOrDefault(nums2[i], 0) + 1);
        }
        int[] temp = new int[n];

        for(int i = 0; i < n; i++) {
            if(map.containsKey(nums1[i]) && map.get(nums1[i]) > 0) {

                temp[k] = nums1[i];
                k++;
                map.put(nums1[i], map.get(nums1[i]) - 1);
            }
        }
        int[] ans = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = temp[i];
        }
        return ans;
    }
}
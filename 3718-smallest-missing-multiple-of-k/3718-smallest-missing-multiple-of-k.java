class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        int multiple = k; //first the k is smallest one so check start with that num
        while (set.contains(multiple)) {
            multiple = multiple + k; //untill we find the number that is missing on set
        }
        return multiple;
    }
}
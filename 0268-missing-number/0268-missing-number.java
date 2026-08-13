class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums.length;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor;
    }
}
// x ^ x = 0
// x ^ 0 = x
// Everything that exists in both places cancels, and only the missing number remains.
// XOR because duplicate numbers cancel each other, leaving only the missing number
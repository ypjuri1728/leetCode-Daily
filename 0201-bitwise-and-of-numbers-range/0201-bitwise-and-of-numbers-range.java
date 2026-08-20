class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while (left < right) {
            left = left >> 1; // remove changing bit
            right = right >> 1;

            shift++;// remember how many bits removed
        }

        return left << shift; // put zeros back
    }
}

//but for small range we can use this
// result = left;

// for (int i = left + 1; i <= right; i++) {
//     result = result & i;
// }
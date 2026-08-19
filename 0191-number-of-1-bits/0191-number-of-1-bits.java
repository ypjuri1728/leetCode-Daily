class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {// n&1 :Check the last bit
                count++;
            }
            n = n >> 1;//removed the last bit that we just checked.
            //0101 → 0010 → 0001 → 0000
        }
        return count;
    }
}
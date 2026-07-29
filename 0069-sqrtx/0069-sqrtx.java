class Solution {
    public int mySqrt(int x) {
        int i = 0;
        while ((i + 1) <= x / (i + 1)) {
            i++;
        }
        return i;
    }
}
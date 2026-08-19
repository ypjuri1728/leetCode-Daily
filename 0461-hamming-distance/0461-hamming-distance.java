class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x^y; // operation
        int count =0;
        while(xor !=0){
        if((xor&1)==1){ //same hoga to 0 and diff hoga to 1
            count++;
        }
        xor = xor >>1; }//upto 0000
        return count;
    }
}
// ^  → XOR → compare two bits
// &  → AND → check a particular bit
// >> → shift → move to next bit

// x ^ y       → find different bits
// xor & 1     → check current bit
// xor >> 1    → move to next bit
// count++     → count differences
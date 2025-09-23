class Solution {
    public boolean isPowerOfFour(int n) {
        // must be positive
        if (n <= 0) return false;
        
        // check power of two (only one bit set)
        if ((n & (n - 1)) != 0) return false;
        
        // check that bit is in even position
        return (n & 0x55555555) != 0;
        // 0x55555555 = binary: 01010101... ensures bit is in correct (even) position
    }
}

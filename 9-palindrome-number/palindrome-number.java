class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (but not 0 itself) cannot be palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // For even length palindromes: x == reversed
        // For odd length palindromes: x == reversed / 10 (middle digit ignored)
        return (x == reversed || x == reversed / 10);
    }
}

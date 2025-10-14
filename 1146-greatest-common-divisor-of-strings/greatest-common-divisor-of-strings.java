class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check concatenation condition
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // Compute GCD of lengths
        int len1 = str1.length();
        int len2 = str2.length();
        int gcdLen = gcd(len1, len2);
        // The gcd string is the prefix of either string of length gcdLen
        return str1.substring(0, gcdLen);
    }

    // Helper: compute gcd of two integers
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

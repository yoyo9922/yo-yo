class Solution {
    public boolean isPalindrome(String s) {
        // Convert string to lowercase
        s = s.toLowerCase();

        // Use two pointers
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Move left pointer if not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right pointer if not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        // If all characters matched
        return true;
    }
}

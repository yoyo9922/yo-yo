class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();

        // Case 1: All letters are uppercase
        if (word.equals(word.toUpperCase())) {
            return true;
        }

        // Case 2: All letters are lowercase
        if (word.equals(word.toLowerCase())) {
            return true;
        }

        // Case 3: Only first letter uppercase, rest lowercase
        String firstUpperRestLower = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        if (word.equals(firstUpperRestLower)) {
            return true;
        }

        // None of the cases matched
        return false;
    }
}

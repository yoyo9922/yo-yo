class Solution {
    public String convert(String s, int numRows) {
        // Edge case: if only 1 row or shorter than numRows, return as is
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Create a StringBuilder array for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Traverse each character and place it in the appropriate row
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Change direction when reaching top or bottom
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move up or down depending on direction
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}

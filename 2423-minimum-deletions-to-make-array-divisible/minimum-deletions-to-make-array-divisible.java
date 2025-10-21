import java.util.Arrays;

class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        // Step 1: compute gcd of numsDivide
        int g = numsDivide[0];
        for (int num : numsDivide) {
            g = gcd(g, num);
        }

        // Step 2: sort nums
        Arrays.sort(nums);

        // Step 3: find the first number in nums that divides g
        for (int i = 0; i < nums.length; i++) {
            if (g % nums[i] == 0) {
                return i; // deletions = index of this number
            }
        }

        return -1; // no number divides g
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}


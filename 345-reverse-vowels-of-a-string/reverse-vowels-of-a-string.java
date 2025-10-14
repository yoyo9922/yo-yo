class Solution {
    public String reverseVowels(String s) {
        // Convert to character array for easy swapping
        char[] arr = s.toCharArray();
        
        // Set of vowels for quick checking
        String vowels = "aeiouAEIOU";
        
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            // Move left pointer until it finds a vowel
            while (left < right && vowels.indexOf(arr[left]) == -1) {
                left++;
            }
            // Move right pointer until it finds a vowel
            while (left < right && vowels.indexOf(arr[right]) == -1) {
                right--;
            }
            
            // Swap the vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        
        // Return the modified string
        return new String(arr);
    }
}

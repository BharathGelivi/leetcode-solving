class Solution {
    public boolean isPalindrome(String s) {
        // Matches everything that is NOT a letter or a digit
        String s2 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        for (int i = 0; i < s2.length() / 2; i++) {
            if (s2.charAt(i) != s2.charAt(s2.length() - 1 - i)) {
                return false;
            } 
        }
        return true;
    }
}
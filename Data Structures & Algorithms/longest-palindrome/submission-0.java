class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> count = new HashMap<>();
        int palindrome = 0;

        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);

            if (count.get(s.charAt(i)) % 2 == 0) {
                palindrome+=2;
            }
        }

        for (int value : count.values()) {
            if (value % 2 == 1) {
                palindrome++;
                break;
            }
        }

        return palindrome;
    }
}
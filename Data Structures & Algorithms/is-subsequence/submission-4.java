class Solution {
    public boolean isSubsequence(String s, String t) {
        if (t.isEmpty()) {
            return false;
        }

        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            while (right < t.length() && s.charAt(i) != t.charAt(right)) {
               right++;
            }

            if (right == t.length() && i + 1 <= s.length()) {
                return false;
            }

            right++;
        }

        return true;
    }
}
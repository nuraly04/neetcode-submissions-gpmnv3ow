class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int left = 0, right = 0;

        while (right < s.length()) {
            right = left;
            HashSet<Character> set = new HashSet<>();
            while (right < s.length() && !set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            }

            longest = Math.max(longest, right - left);
            left++;
            right++;
        }

        return longest;
    }
}

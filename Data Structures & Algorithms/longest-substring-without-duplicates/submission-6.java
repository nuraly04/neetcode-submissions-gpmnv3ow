class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int max = 0;

        for (int i = 0; i < chars.length; i++) {
            Set<Character> set = new HashSet<>();
            int right = i;

            while (right < chars.length && !set.contains(chars[right])) {
                set.add(chars[right]);
                right++;
            }

            max = Math.max(max, right - i);
        }

        return max;
    }
}

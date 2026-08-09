class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int longest = 0;
        int[] arr = new int[26];
        int freqMax = 0;
        char[] chars = s.toLowerCase().toCharArray();

        while (right < s.length()) {
            arr[chars[right] - 'a']++;

            if (arr[chars[right] - 'a'] > freqMax) {
                freqMax = arr[chars[right] - 'a'];
            }

            int windowSize = right - left + 1;

            while (windowSize - freqMax > k) {
                arr[chars[left] - 'a']--;
                left++;
                windowSize = right - left + 1;
            }

            longest = Math.max(longest, windowSize);

            right++;
        }

        return longest;
    }
}

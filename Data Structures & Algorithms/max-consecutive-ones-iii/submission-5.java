class Solution {
    public int longestOnes(int[] nums, int k) {
        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            int right = i;
            int d = 0;

            while (right < nums.length) {
                if (nums[right] == 0 && d < k) {
                    d++;
                } else if (nums[right] == 0 && d >= k) {
                    break;
                }
                right++;
            }

            longest = Math.max(longest, right - i);
        }

        return longest;
    }
}
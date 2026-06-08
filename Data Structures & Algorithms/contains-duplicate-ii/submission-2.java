class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean duplicate= false;

        for (int i = 0; i < nums.length; i++) {
            int right = i + 1;

            while (right < nums.length) {
                if (nums[i] == nums[right]) {
                    duplicate = right - i <= k;
                }
                right++;
            }
        }

        return duplicate;
    }
}
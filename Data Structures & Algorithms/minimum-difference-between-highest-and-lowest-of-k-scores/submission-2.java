class Solution {
    public int minimumDifference(int[] nums, int k) {
        int left = 0;
        int right = k - 1;

        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;

        while (right<nums.length) {
            int s = nums[left];
            int b = nums[left];

            for (int i = left + 1; i <= right; i++) {
                s = Math.min(s, nums[i]);
                b = Math.max(b, nums[i]);
            }

            min = Math.min(min, b - s);
            left++;
            right++;
        }

        return min;
    }
}
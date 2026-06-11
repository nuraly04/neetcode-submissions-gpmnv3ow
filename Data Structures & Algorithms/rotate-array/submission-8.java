class Solution {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int right = nums.length - 1;

            int swap = nums[right];

            while (right > 0) {
                nums[right] = nums[right - 1];
                right--;
            }

            nums[0] = swap;
        }
    }
}
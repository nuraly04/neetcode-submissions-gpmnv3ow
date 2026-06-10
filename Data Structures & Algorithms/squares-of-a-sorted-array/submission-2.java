class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                    int num = nums[j];
                    nums[j] = nums[i];
                    nums[i] = num;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        return nums;
    }
}
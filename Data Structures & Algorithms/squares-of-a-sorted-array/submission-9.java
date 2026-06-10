class Solution {
    public int[] sortedSquares(int[] nums) {
         int[] arr = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        int idx = nums.length - 1;

        while (left <= right) {
            int leftValue = nums[left] * nums[left];
            int rightValue = nums[right] * nums[right];
            
            if (leftValue > rightValue) {
                arr[idx] = leftValue;
                left++;
                idx--;
            } else {
                arr[idx] = rightValue;
                right--;
                idx--;
            }
        }

        return arr;
    }
}
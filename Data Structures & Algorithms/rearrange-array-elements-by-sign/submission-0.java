class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0;
        int right = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                arr[left] = nums[i];
                left+=2;
            } else {
                arr[right] = nums[i];
                right+=2;
            }
        }

        return arr;
    }
}
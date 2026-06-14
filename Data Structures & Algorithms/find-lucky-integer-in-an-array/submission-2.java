class Solution {
    public int findLucky(int[] arr) {
        int[] nums = new int[500];

        for (int num : arr) {
            nums[num]++;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (nums[arr[i]] == arr[i]) {
                return arr[i];
            }
        }

        return -1;
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
                if (nums.length == 0)
            return new int[] {-1,-1};
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) /2;

            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] > target) {
                right = mid- 1;
            } else left = mid +1;
        }

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int mid = (i + j) /2 + 1;

            if (nums[mid] == target) {
                i = mid;
            } else if (nums[mid] > target) {
                j = mid -1;
            } else i = mid + 1;
        }

        if (nums[left] == target) {
            arr[0] = left;
            arr[1] = j;
        }

        return arr;
    }
}
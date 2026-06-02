class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = nums.length;
        int left =0;
        boolean check = false;

        while (left < nums.length) {
            int sum = 0;
            int curr = 0;

            int right = left;

            while (right < nums.length && sum < target) {
                curr++;
                sum+=nums[right];
                right++;
            }


            left++;
            if (sum >= target) {
                check = true;
                min = Math.min(min, curr);
            }
        }

        return (min == nums.length && !check) ? 0 : min;
    }
}
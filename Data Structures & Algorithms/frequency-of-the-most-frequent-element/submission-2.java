class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int[] pref = new int[nums.length];

        pref[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            pref[i] = nums[i] + pref[i - 1];
        }

        int left = 0;
        int right = 0;
        int max = 0;


        while (right < nums.length) {
            int c = nums[right] * (right - left + 1) - (pref[right] - (left > 0 ? pref[left - 1] :0));

            while (c > k) {
                left++;
                c = nums[right] * (right - left + 1) - (pref[right] - (left > 0 ? pref[left - 1] : 0));
            }
            
            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;
    }
}
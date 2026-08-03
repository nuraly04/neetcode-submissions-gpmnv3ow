class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> pairs = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            List<List<Integer>> list = getPairs(nums, i + 1, -nums[i]);

            for (List<Integer> pair : list) {
                pair.add(nums[i]);
                pairs.add(pair);
            }
        }

        return pairs;
    }

    private List<List<Integer>> getPairs(int[] nums, int left, int target) {
        List<List<Integer>> pairs = new ArrayList<>();
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                List<Integer> pair = new ArrayList<>();
                pair.add(nums[left]);
                pair.add(nums[right]);
                pairs.add(pair);
                left++;
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
            } else if (sum > target) {
                right--;
            } else left++;
        }

        return pairs;
    }
}

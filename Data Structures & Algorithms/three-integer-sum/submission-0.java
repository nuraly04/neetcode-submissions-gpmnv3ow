class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listSum = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            List<List<Integer>> pairs = sum(nums, i + 1, -nums[i]);
            for (List<Integer> pair : pairs) {
                pair.add(nums[i]);
                listSum.add(pair);
            }
        }

        return listSum;
    }

    private List<List<Integer>> sum(int[] nums, int left, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int right = nums.length -1;
        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                List<Integer> pair = new ArrayList<>();
                pair.add(nums[left]);
                pair.add(nums[right]);
                list.add(pair);
                left++;
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
            } else if (sum > target) {
                right--;
            } else left++;
        }

        return list;
    }
}

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for (Map.Entry entry : map.entrySet()) {
            if ((Integer) entry.getValue() > nums.length / 3) {
                list.add((Integer) entry.getKey());
            }
        }

        return list;
    }
}
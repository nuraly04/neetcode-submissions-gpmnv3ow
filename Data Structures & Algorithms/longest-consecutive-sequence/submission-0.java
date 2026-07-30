class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            int curr = 0;
            while (set.contains(num)) {
                curr++;
                num = num - 1;
            }

            longest = Math.max(longest, curr);
        }

        return longest;
    }
}

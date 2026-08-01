class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> maps = new HashMap<>();

        for (int num : nums) {
            maps.putIfAbsent(num, 0);
            maps.computeIfPresent(num, (q,v) -> v + 1);
        }

        Map<Integer, List<Integer>> valueMap = new HashMap<>();
        int[] arr = new int[maps.size()];
        int idx = 0;

        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            valueMap.putIfAbsent(entry.getValue(), new ArrayList<>());
            valueMap.computeIfPresent(entry.getValue(), (q,v) -> {
                v.add(entry.getKey());
                return v;
            });

            arr[idx] = entry.getValue();
            idx++;
        }

        sort(arr, 0, arr.length - 1);

        int[] res = new int[k];
        int ind = arr.length - 1;
        int i = 0;
        while (i < k && ind >= 0) {
            int key = arr[ind];
            List<Integer> list = valueMap.get(key);
            for (int num : list) {
                res[i] = num;
                i++;
            }

            do {
                ind--;
            } while (ind >= 0 && key == arr[ind]);
        }

        return res;
    }

    private void sort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = getPivot(nums, left, right);

        sort(nums, pivot + 1, right);
        sort(nums, left, pivot - 1);
    }

    private int getPivot(int[] nums, int left, int right) {
         int pivot = nums[right];
        int lo = left;

        for (int i = lo; i < right; i++) {
            if (pivot > nums[i]) {
                int swap = nums[lo];
                nums[lo] = nums[i];
                nums[i] = swap;
                lo++;
            }
        }

        int swap = nums[lo];
        nums[lo] = pivot;
        nums[right] = swap;

        return lo;
    }
}
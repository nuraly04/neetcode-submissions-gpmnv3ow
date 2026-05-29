class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
         int left = 0;
        int right = k;
        int count = 0;

        while (right <= arr.length) {
            int first = left;
            int sum = 0;
            while (first < right) {
                sum += arr[first];
                first++;
            }

            if (sum / k >= threshold) {
                count++;
            }

            left++;
            right++;
        }

        return count;
    }
}
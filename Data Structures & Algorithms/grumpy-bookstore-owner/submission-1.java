class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max = 0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0)
                max+=customers[i];
        }

        int possSum = max;

        int left = 0;
        int right = minutes - 1;

        while (right < customers.length) {
            int sum = 0;
            int i = left;
            while (i <= right) {
                if (grumpy[i] == 1) {
                    sum+=customers[i];
                }
                i++;
            }

            max = Math.max(max, possSum + sum);
            right++;
            left++;
        }


        return max;
    }
}
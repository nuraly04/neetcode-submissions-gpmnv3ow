class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = blocks.length();
        char[] chars = blocks.toCharArray();

        int left = 0;
        int right = k - 1;

        while (right < chars.length) {
            int count = 0;
            int border = right;
            while (border < chars.length && border >= left) {
                if (chars[border] == 'W') {
                    count++;
                }
                border--;
            }

            min = Math.min(min, count);
            left++;
            right++;
        }

        return min;
    }
}
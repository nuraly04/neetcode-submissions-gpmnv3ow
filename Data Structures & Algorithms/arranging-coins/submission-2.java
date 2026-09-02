class Solution {
    public int arrangeCoins(int n) {
       int ar = 0;
        int s = 0;

        while (n >= 0) {
            s = s + 1;
            n -= s;
            ar++;
        }

        return ar - 1;
    }
}
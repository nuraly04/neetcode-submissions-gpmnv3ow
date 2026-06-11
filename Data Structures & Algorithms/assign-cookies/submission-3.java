class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int first = 0;
        int second = 0;
        int count = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while (second < s.length && first < g.length) {
            if (s[second] >= g[first]) {
                count++;
                first++;
            }

            second++;
        }

        return count;
    }
}
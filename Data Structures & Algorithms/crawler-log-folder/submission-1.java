class Solution {
    public int minOperations(String[] logs) {
        int count = 0;

        for (String str : logs) {
            if (str.equals("./")) {
                continue;
            }
            if (!str.equals("../")) {
                count++;
            } else if (count > 0) {
                count--;
            }
        }

        return count;
    }
}
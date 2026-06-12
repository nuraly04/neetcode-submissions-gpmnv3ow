class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for (String string : details) {
            int age = Integer.parseInt(string.substring(11, 13));
            if (age > 60) count++;
        }

        return count;
    }
}
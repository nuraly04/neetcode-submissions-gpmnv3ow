class Solution {
    public int lengthOfLastWord(String s) {
        char [] chars = s.toCharArray();
        int count = 0;

        int right = chars.length - 1;

        while (chars[right] == ' ') {
            right--;
        }

        for (int i = right; i >= 0 ; i--) {

                if (chars[i] == ' ') {
                    break;
                }
                count++;
        }

        return count;
    }
}
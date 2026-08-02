class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toLowerCase().toCharArray();


        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(chars[left])) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(chars[right])) {
                right--;
            }

            if (chars[left] != chars[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

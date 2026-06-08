class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int[] arr = new int[26];
        char[] sChar = s1.toCharArray();
        for (int i = 0; i < sChar.length; i++) {
            arr[sChar[i] - 'a']++;
        }
        int left = 0;
        int right = s1.length();

        while (right <= s2.length()) {

            int[] copy = new int[26];

            for (int i = 0; i < arr.length; i++) {
                copy[i] = arr[i];
            }

            for (int i = left; i < right; i++) {
                copy[s2.charAt(i) - 'a']--;
            }

            if (check(copy)) return true;

            left++;
            right++;
        }

        return false;
    }

    private boolean check(int[] arr) {
        for (int num : arr) {
            if (num > 0) return false;
        }

        return true;
    }
}

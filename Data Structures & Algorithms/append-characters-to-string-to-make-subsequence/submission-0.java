class Solution {
    public int appendCharacters(String s, String t) {
        int tLeft = 0;
        int sLeft = 0;

        while (sLeft < s.length()) {
            if (tLeft == t.length()) break;
            if (t.charAt(tLeft) == s.charAt(sLeft)) {
                tLeft++;
            }
            sLeft++;
        }

        return t.length() - tLeft;
    }
}
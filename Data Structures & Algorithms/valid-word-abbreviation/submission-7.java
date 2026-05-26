class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
         int idx = 0;
        int idxAbbr = 0;
        for (int i = 0; i < word.length(); i++) {
            if (idx > 0) {
                idx--;
                continue;
            }
            if (idxAbbr >= abbr.length()) {
                return false;
            }
            System.out.println(idxAbbr);
            if (Character.isDigit(abbr.charAt(idxAbbr))) {
                StringBuilder value = new StringBuilder();
                while (idxAbbr < abbr.length() && Character.isDigit(abbr.charAt(idxAbbr))) {
                    value.append(abbr.charAt(idxAbbr));
                    idxAbbr++;
                }
                int q = 0;
                while (q < value.length() && value.charAt(q) == '0') {
                    idxAbbr++;
                    q++;
                }
                idx = Integer.parseInt(String.valueOf(value));
                idx--;
                continue;
            }
            if (word.charAt(i) != abbr.charAt(idxAbbr)) {
                return false;
            }
            idxAbbr++;
        }

        if (idx > 0 || idxAbbr != abbr.length()) {
            return false;
        }

        return true;
    }
}
class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] strings = s.split(" ");
        if (pattern.length() != strings.length) {
            return false;
        }

        Map<String, Character> mapsKey = new HashMap<>();
        Map<Character, String> maps = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            if (maps.get(pattern.charAt(i)) == null && mapsKey.get(strings[i]) == null) {
                maps.put(pattern.charAt(i), strings[i]);
                mapsKey.put(strings[i], pattern.charAt(i));
            }

            if (!Objects.equals(maps.get(pattern.charAt(i)), strings[i])) {
                return false;
            }
        }

        return true;
    }
}
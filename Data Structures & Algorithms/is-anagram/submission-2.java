class Solution {
    public boolean isAnagram(String s, String t) {
          if (s.length() != t.length())
            return false;

        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();

        Arrays.sort(sch);
        Arrays.sort(tch);

        if (Arrays.equals(sch, tch)) {
            return true;
        } else return false;  
    }
}

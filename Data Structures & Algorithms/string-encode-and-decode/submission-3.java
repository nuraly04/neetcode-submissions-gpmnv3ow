class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for (String str : strs) {
            builder.append(str.length()).append("#").append(str);
        }

        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            StringBuilder builder = new StringBuilder();
            int e= i;
            while (e < chars.length && chars[e] != '#') {
                e++;
            }

            int indx = Integer.parseInt(str.substring(i, e));
            e++;

            for (int j = 0; j < indx; j++) {
                builder.append(chars[e]);
                e++;
            }

            i = e - 1;
            list.add(builder.toString());
        }

        return list;
    }
}
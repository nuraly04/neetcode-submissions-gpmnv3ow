class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String str : emails) {
            StringBuilder builder = new StringBuilder();

            int idx = 0;

            while (idx < str.length()) {

                if (str.charAt(idx) == '.') {
                    idx++;
                }

                if (str.charAt(idx) == '+') {
                    while (str.charAt(idx) != '@') {
                        idx++;
                    }

                    while (idx < str.length()) {
                        builder.append(str.charAt(idx));
                        idx++;
                    }

                    continue;
                }

                builder.append(str.charAt(idx));
                idx++;
            }

            set.add(builder.toString());
        }

        System.out.println(set);

        return set.size();
    }
}
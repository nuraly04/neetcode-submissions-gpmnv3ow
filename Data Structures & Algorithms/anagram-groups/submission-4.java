class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> maps = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            int[] arr = new int[26];

            for (int j = 0; j < str.length(); j++) {
                arr[str.charAt(j) - 'a']++;
            }

            StringBuilder builder = new StringBuilder();

            for (int j = 0; j < arr.length; j++) {
                builder.append("#").append(arr[j]);
            }

            System.out.println(builder);

            maps.putIfAbsent(builder.toString(), new ArrayList<>());
            maps.computeIfPresent(builder.toString(), (k, v) -> {
                v.add(str);
                return v;
            });
        }

        List<List<String>> list = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : maps.entrySet()) {
            list.add(entry.getValue());
        }

        return list;
    }
}

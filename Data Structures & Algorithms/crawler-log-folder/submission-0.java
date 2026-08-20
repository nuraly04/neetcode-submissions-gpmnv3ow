class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();

        for (String str : logs) {
            if (str.equals("./")) {
                continue;
            }
            if (!str.equals("../")) {
                stack.add(str);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }

        }

        return stack.size();
    }
}
class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();

        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                stack.add(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                else if (s.charAt(i) != map.get(stack.peek())) {
                    return false;
                } else stack.pop();
            }
        }

        return stack.isEmpty();
    }
}

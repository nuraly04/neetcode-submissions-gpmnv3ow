class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String operation : operations) {
            if (operation.equals("+")) {

                stack.add(stack.peek() + stack.get(stack.size() - 2));
                continue;
            } else if (operation.equals("D")) {
                stack.add(stack.peek() * 2);
                continue;
            } else if (operation.equals("C")) {
                stack.pop();
                continue;
            }

            stack.add(Integer.parseInt(operation));
        }
        
        int sum = 0;

        for (Integer num : stack) {
            sum+=num;
        }

        return sum;
    }
}
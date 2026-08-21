class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (String operation : operations) {
            if (operation.equals("+")) {
                
                int y = stack.peek() + stack.get(stack.size() - 2);
                stack.add(y);
                sum+=y;
                continue;
            } else if (operation.equals("D")) {
                int y = stack.peek() * 2;
                stack.add(y);
                sum+=y;
                continue;
            } else if (operation.equals("C")) {
                sum -= stack.pop();
                continue;
            }

            int y = Integer.parseInt(operation);
            stack.add(y);
            sum+=y;
        }

        return sum;
    }
}
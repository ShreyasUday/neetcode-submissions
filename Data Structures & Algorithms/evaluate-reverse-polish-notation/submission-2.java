class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            if (s.equals("+")) {
                int t1 = stack.pop();
                int t2 = stack.pop();
                stack.push(t1 + t2);
            } else if (s.equals("-")) {
                int t1 = stack.pop();
                int t2 = stack.pop();
                stack.push(t2 - t1);
            } else if (s.equals("*")) {
                int t1 = stack.pop();
                int t2 = stack.pop();
                stack.push(t1 * t2);
            } else if (s.equals("/")) {
                int t1 = stack.pop();
                int t2 = stack.pop();
                stack.push(t2 / t1);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}

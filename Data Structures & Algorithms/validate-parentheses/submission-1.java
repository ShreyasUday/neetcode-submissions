class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (stk.isEmpty()) {
                stk.push(c);
            } else {
                if ((stk.peek() == '(' && c == ')') || (stk.peek() == '{' && c == '}') || (stk.peek() == '[' && c == ']')){
                    stk.pop();
                }
                else{
                    stk.push(c);
                }
                // if(stk.peek() == c){
                //     char temp = stk.pop();
                // }
                // else{
                //     if(c == '('){
                //         stk.push(')');
                //     }
                //     else if(c == '{'){
                //         stk.push('}');
                //     }
                //     else{
                //         stk.push(']');
                //     }
                // }
            }
        }
        if (stk.isEmpty())
            return true;
        return false;
    }
}

class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(char ch : s.toCharArray()){
            if(ch != ']'){
                stack.push(ch);
            }
            else{
                StringBuilder temp = new StringBuilder();
                while(stack.peek() != '['){
                    temp.append(stack.pop());
                }
                temp.reverse();
                stack.pop();
                StringBuilder t = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    t.append(stack.pop());
                }
                t.reverse();
                int num = Integer.parseInt(t.toString());
                String str = "";
                while(num > 0){
                    str += temp.toString();
                    num--;
                }

                for(char c : str.toCharArray()){
                    stack.push(c);
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}
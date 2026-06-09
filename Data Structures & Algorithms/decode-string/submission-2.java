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

/*
STRING IS FUCKING IMMUTABLE

1. PUSH TILL YOU GET ]
2. POP AND STORE IN TEMP_VARIABLE TILL YOU SEE [
3. REVERSE THE TEMP_VARIABLE
4. THEN COMES THE NUMBERS ...... POP AND STORE THEM IN TEMP_NUM_VARIABLE
5. REVERSE THE TEMP_NUM_VARIABLE
6. NOW BUILDER NEW STRING STR FOR THAT SPECIFIC [] BY USING LOOP
7. PUSH THAT STR INTO STACK
8. FINALLY AT THE END OF THE FIRST LOOP WE GET RESULT IN THE 
   STACK SO POP IT AND REVERSE IT AND RETURN
*/
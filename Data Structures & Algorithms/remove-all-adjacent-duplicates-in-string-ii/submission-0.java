class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> stack = new Stack<>();
        int n = s.length();
        for(int i = 0; i<n; i++){
            if(!stack.isEmpty() && stack.peek()[0] == s.charAt(i)){
                stack.peek()[1]++;
            }
            else{
                stack.push(new int[]{s.charAt(i),1});
            }
            if(stack.peek()[1] == k){
                stack.pop();
            }
        }

        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()){
            int[] temp = stack.pop();
            for(int i = 0; i<temp[1]; i++){
                str.append((char)temp[0]);
            }
        }
        return str.reverse().toString();
    }
}
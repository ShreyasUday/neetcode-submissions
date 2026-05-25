class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stack = new Stack<>();

        for(int ast : asteroids){
            
            while(!stack.isEmpty() && ast<0 && stack.peek()>0){
                int rel = stack.peek() - Math.abs(ast);
                if(rel < 0){
                    stack.pop();
                }
                else if(rel > 0){
                    ast = 0;
                }
                else{
                    stack.pop();
                    ast = 0;
                }
            }
            if(ast!=0) stack.push(ast);
        }

        int size = stack.size();
        int[] res = new int[size];

        for(int i = size - 1; i>=0; i--){
            res[i] = stack.pop();
        }
        return res;
    }
}
public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int t = temperatures[i];
            while(!stack.isEmpty() && t>stack.peek()[0]){
                int [] temp = stack.pop();
                res[temp[1]] = i-temp[1];
            }
            stack.push(new int[]{t,i});
        }
        return res;
    }
}


/*
MAKE A STACK WHICH TAKES ELEMENT AND ITS INDEX

1. make a stack and keep adding till you find larger
   number as compared to the top of the stack.
2. when found pop the top and add the difference
   of the pop element's index and the current element's
   index and store it into res array.
*/
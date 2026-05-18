class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        int n = position.length;
        int[][] ps = new int[n][2];
        for (int i = 0; i < n; i++) {
            ps[i][0] = position[i];
            ps[i][1] = speed[i];
        }
        Arrays.sort(ps, (a, b) -> Integer.compare(b[0], a[0]));

        stack.push((double)(target - ps[0][0])/ps[0][1]);

        // int fleets = 1;
        // double prevTime = (double)(target - pair[0][0]) / pair[0][1];
        for (int i = 1; i < n; i++) {
            double time = (double)(target - ps[i][0]) / ps[i][1];
            if (time > stack.peek()) {
                stack.push(time);
            }
        }
        return stack.size();
    }
}

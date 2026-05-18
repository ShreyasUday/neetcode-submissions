class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Stack<Double> stack = new Stack<>();
        int[][] ps = new int[n][2];

        int i = 1;

        while(i<n){
            
            int temp1 = position[i];
            int temp2 = speed[i];
            int j = i-1;
            
            while(j>=0 && position[j]<temp1){
                position[j+1] = position[j];
                speed[j+1] = speed[j];
                j--;
            }
            position[j+1] = temp1;
            speed[j+1] = temp2;
            i++;
        }

        for(int k = 0; k<n; k++){
            ps[k][0] = position[k];
            ps[k][1] = speed[k];
        }

        stack.push( (double)(target - ps[0][0]) / ps[0][1] );

        for(int k = 1; k<n; k++){
            double time = (double)(target - ps[k][0])/ps[k][1];
            if(time > stack.peek()){
                stack.push(time);
            }
        }
        return stack.size();
    }
}

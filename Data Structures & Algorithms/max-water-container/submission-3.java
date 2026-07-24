class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int area = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                int w = j-i;
                int h = Math.min(heights[j], heights[i]);
                int temp = w*h;
                area = Math.max(temp,area);
            }
        }
        return area;
    }
}

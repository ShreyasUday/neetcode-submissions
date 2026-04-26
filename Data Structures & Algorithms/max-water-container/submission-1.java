class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0;
        int j = n-1;
        int area = 0;
        while(i<j){
            int curr = (j-i) * Math.min(heights[i], heights[j]);
            area = Math.max(area,curr);
            if(heights[i]<heights[j]) i++;
            else if(heights[i]>heights[j]) j--;
            else{
                i++;
                j--;
            }
        }
        return area;
    }
}

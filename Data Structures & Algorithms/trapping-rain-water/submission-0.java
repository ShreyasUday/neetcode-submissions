class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int lm = height[i];
        int rm = height[j];
        int trap = 0;
        while(i<j){
            if(lm<rm){
                i++;
                lm = Math.max(lm,height[i]);
                trap += lm-height[i];
            }
            else{
                j--;
                rm = Math.max(rm,height[j]);
                trap += rm-height[j];
            }
        }
        return trap;
    }
}

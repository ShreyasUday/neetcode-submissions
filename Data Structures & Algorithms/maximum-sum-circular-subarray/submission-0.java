class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int i = 0;
        int gMax = nums[0];
        int gMin = nums[0];
        int cMax = 0;
        int cMin = 0;
        int max = 0;
        while(i<n){
            cMax = Math.max(cMax+nums[i], nums[i]);
            cMin = Math.min(cMin+nums[i], nums[i]);
            max += nums[i];
            gMax = Math.max(gMax,cMax);
            gMin = Math.min(gMin,cMin);
            i++;
        }
        return gMax > 0 ? Math.max(gMax, max-gMin) : gMax;
    }
}
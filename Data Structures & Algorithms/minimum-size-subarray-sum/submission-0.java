class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;

        while(h<n){
            sum += nums[h];

            while(sum>=target){
                res = Math.min(res,h-l+1);
                sum -= nums[l];
                l++;
            }
            h++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
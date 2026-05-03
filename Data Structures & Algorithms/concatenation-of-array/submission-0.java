class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n+n];

        int first = 0;
        int second = n;

        while(second != n+n){
            ans[first] = nums[first];
            ans[second] = nums[first];
            first++;
            second++;
        }
        return ans;
    }
}
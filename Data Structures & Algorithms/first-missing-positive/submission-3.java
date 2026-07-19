class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int checkZero = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] == 1) checkZero = 1;
        }
        if(checkZero == 0) return 1;

        for(int i = 0; i<n; i++){
            if(nums[i] < 0 || nums[i] == 0 || nums[i] > n) nums[i] = 1;
        }

        for(int i = 0; i<n; i++){
            int index = Math.abs(nums[i]) - 1;
            nums[index] = -Math.abs(nums[index]);
        }
        for(int i = 0; i<n; i++){
            if(nums[i] > 0) return i + 1;
        }
        return n+1;
    }
}
/*
1. first check for 1 in the given array. if not present return 1.
2. clean array (-ve numbers , zeros , and elements greater than n)
3. now for every ith value make (ith element) - 1 -ve
4. now traveerse for last time to check for element greater than 0 andf dreturn i + 1
*/
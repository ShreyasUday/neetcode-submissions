class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] s = new int[nums.length];
        int[] p = new int[nums.length];
        int[] res = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            if(i-1 < 0){
                p[i] = 1;
                s[i] = 1;
            }
            else{
                p[i] = nums[i-1] * p[i-1];
                s[i] = nums[nums.length - i] * s[i-1];
            }
        }

        for(int i = 0; i<nums.length; i++){
            res[i] = p[i] * s[s.length - 1 - i];
        }
        return res;
    }
}  

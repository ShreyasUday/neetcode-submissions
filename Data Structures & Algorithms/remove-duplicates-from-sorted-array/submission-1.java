class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        int l = 0;
        int h = 1;

        while(h<n){
            if(nums[l] != nums[h]){
                nums[l+1] = nums[h];
                l++;
            }
            h++;
        }
        return l+1;
    }
}
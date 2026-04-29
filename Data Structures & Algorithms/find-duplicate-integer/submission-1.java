class Solution {
    public int findDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        Arrays.sort(nums);

        while(l<=r){
            if(l>0){
                if(nums[l] < nums[r] && nums[l-1] != nums[l] && nums[l] != nums[r]){
                    l++;
                }
                else{
                    return nums[l];
                }
            }
            else{
                if(nums[l] < nums[r] && nums[l] != nums[r]){
                    l++;
                }
                else{
                    return nums[l];
                }
            }
        }
        return -1;
    }
}

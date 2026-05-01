class Solution {

    public int[] swap(int[]arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return arr;
    }

    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int i = 0;

        // if(nums[l] > nums[r]) nums = swap(nums,l,r);

        while(i<=r){
            if(nums[i] == 0){
                nums = swap(nums,i,l);
                l++;
                i++;
            }
            else if(nums[i] == 2){
                nums = swap(nums,i,r);
                r--;
            }
            else{
                i++;
            }
        }
    }
}
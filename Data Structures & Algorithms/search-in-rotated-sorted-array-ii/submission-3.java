class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        // int mid = 0;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target) return true;

            if(nums[l]<nums[mid]){
                if(target>=nums[l] && target<nums[mid]){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }
            }
            else if(nums[l]>nums[mid]){
                if(target>nums[mid] && target<=nums[r]){
                    l = mid+1;
                }
                else{
                    r = mid-1;
                }
            }
            else l++;
        }

        // for(int i = 0; i<n-1; i++){
        //     if(nums[i]>nums[i+1]){
        //         mid = i;
        //         break;
        //     }
        // }
        // if(mid == 0){
        //     mid = l +(r-l)/2;
        // }

        // while(l<r){
        //     if(nums[l]<=nums[r]){
        //         mid = l +(r-l)/2;
        //         if(nums[mid] == target) return true;
        //         else if(nums[mid]<target) l = mid+1;
        //         else r = mid;
        //     }
        //     else{
        //         if(nums[mid] == target) return true;
        //         else if(target<nums[mid] && target<nums[r]){
        //             l = mid+1;
        //         }
        //         else{
        //             r = mid;
        //         }
        //         int tMid = l+(r-l)/2;
        //     }
        // }
        return false;
    }
}
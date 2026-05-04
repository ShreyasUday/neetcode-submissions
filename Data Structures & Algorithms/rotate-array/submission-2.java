class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int trueK = k%n;
        
        int l3 = 0;
        int h3 = n-1;
        while(l3<h3){
            int temp = nums[l3];
            nums[l3] = nums[h3];
            nums[h3] = temp;
            l3++;
            h3--;
        }


        int l1 = 0;
        int h1 = trueK-1;
        while(l1<h1){
            int temp = nums[l1];
            nums[l1] = nums[h1];
            nums[h1] = temp;
            l1++;
            h1--;
        }


        int l2 = trueK;
        int h2 = n-1;
        while(l2<h2){
            int temp = nums[l2];
            nums[l2] = nums[h2];
            nums[h2] = temp;
            l2++;
            h2--;
        }

    }
}
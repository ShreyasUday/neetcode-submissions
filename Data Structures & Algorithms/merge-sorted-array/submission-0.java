class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] nums3 = Arrays.copyOf(nums1,m);
        int n3 = nums3.length;

        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        while(i3<n3 && i2<n2){
            if(nums3[i3] < nums2[i2]){
                nums1[i1] = nums3[i3];
                i3++;
            }
            else{
                nums1[i1] = nums2[i2];
                i2++;
            }
            i1++;
        }

        while(i3<n3){
            nums1[i1] = nums3[i3];
            i3++;
            i1++;
        }

        while(i2<n2){
            nums1[i1] = nums2[i2];
            i2++;
            i1++;
        }
    }
}
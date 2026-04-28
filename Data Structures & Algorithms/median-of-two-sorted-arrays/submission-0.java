class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a1 = nums1;
        int[] a2 = nums2;
        int total = a1.length + a2.length;
        int half = (total + 1)/2;

        if(a2.length < a1.length){
            int[] temp = a1;
            a1 = a2;
            a2 = temp;
        }

        int l = 0;
        int r = a1.length;
        while(l<=r){
            int mid = l + (r-l)/2;
            int hMid = half - mid;

            int a1L = mid>0 ? a1[mid-1] : Integer.MIN_VALUE;
            int a1R = mid<a1.length ? a1[mid] : Integer.MAX_VALUE;

            int a2L = hMid>0 ? a2[hMid-1] : Integer.MIN_VALUE;
            int a2R = hMid<a2.length ? a2[hMid] : Integer.MAX_VALUE;

            if(a1L <= a2R && a2L <= a1R){
                if(total%2 != 0){
                    return Math.max(a1L,a2L);
                }
                else{
                    return (Math.max(a1L,a2L) + Math.min(a1R,a2R))/2.0;
                }
            }
            else if(a1L > a2R){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }
}

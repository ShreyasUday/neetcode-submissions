class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0;
        for(int i = 0; i<n; i++){
            max = Math.max(max,piles[i]);
        }
        int l = 1;
        int r = max;
        int res = max;
        while(l<=r){
            int mid = l + (r-l)/2;
            int check = 0;
            for(int i = 0; i<n; i++){
                check += (int)Math.ceil((double)piles[i]/mid); 
            }
            if(check>h){
                l = mid+1;
            }
            else{
                int temp = mid;
                res = Math.min(res,temp);
                r = mid-1;
            }
        }
        return res;
    }
}

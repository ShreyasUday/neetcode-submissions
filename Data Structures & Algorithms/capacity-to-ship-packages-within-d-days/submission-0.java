class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;

        int low = 0;
        int high = 0;
        for (int i = 0; i < n; i++) {
            low = Math.max(low,weights[i]);
            high += weights[i];
        }
        int l = low;
        int h = high;

        int res = h;

        while (l <= h) {
            int cap = l + (h - l) / 2;
            int d = days;
            int currCap = cap;
            int ships = 1;
            for(int w : weights){
                if(currCap - w < 0){
                    ships++;
                    currCap = cap;
                }
                currCap -= w;
            }
            if(ships <= days){
                res = Math.min(res,cap);
                h = cap - 1;
            }
            else{
                l = cap + 1;
            }
        }
        return res;
    }
}
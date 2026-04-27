class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mProfit = 0;
        int l = 0;
        int r = 1;
        while(r<n){
            if(prices[l]<prices[r]){
                int sum = prices[r] - prices[l];
                mProfit = Math.max(mProfit,sum);
            }
            else{
                l = r;
            }
            r++;
        }
        return mProfit;
    }
}

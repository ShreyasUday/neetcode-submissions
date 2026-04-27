class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mProfit = 0;
        // int j = n-1;
        for(int i = 0; i<n-1; i++){
            int j = n-1;
            while(j>i){
                int sum = prices[j] - prices[i];
                mProfit = Math.max(mProfit,sum);
                j--;
            }
        }
        return mProfit;
    }
}

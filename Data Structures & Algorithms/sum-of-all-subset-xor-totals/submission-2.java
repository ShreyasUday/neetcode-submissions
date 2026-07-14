class Solution {
    ArrayList sums = new ArrayList<>();
    void subSet(int idx, int[] arr, int sum){
        if(idx == arr.length){
            sums.add(sum);
            return;
        }
        subSet(idx+1,arr,sum ^ arr[idx]);
        subSet(idx+1,arr,sum);
    }
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        
        subSet(0,nums,0);
        int res = 0;
        for(int i = 0; i<sums.size(); i++){
            res += (int)sums.get(i);
        }
        return res;
    }
}
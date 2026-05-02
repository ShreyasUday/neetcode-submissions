class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        // for(int num : nums){
        //     if(map.containsKey(num)){
        //         map.put(num,map.get(num)+1);
        //     }
        //     else{
        //         map.put(num,1);
        //     }
        // }

        int res = 0;
        int sum = 0;
        map.put(0,1);

        for(int num : nums){
            sum += num;
            if(map.containsKey(sum-k)){
                res += map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return res;
    }
}
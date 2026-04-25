class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int i = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(i<nums.length){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                res[0] = map.get(rem);
                res[1] = i;
            }
            map.put(nums[i],i);
            i++;
        }
        return res;
    }
}

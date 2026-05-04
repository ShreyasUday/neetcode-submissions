class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                // map.put(nums[i],map.get(nums[i])+1);
                if(Math.abs(map.get(nums[i]) - i) <= k){
                    return true;
                }
                else{
                    map.put(nums[i],i);
                }
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
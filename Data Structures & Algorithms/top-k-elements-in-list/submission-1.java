class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int[] res = new int[k];
        List<Map.Entry<Integer,Integer>> mp = new ArrayList<>(map.entrySet());
        mp.sort((a,b) -> b.getValue() - a.getValue());
        for(int i = 0; i<k; i++){
            res[i] = mp.get(i).getKey();
        }
        return res;
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i],hmap.get(nums[i])+1);
            }else{
                hmap.put(nums[i],1);
            }
        }
        List<Map.Entry<Integer,Integer>> sets = new ArrayList<>(hmap.entrySet());
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(Map.Entry<Integer,Integer> set : sets){
            List<Integer> list = new ArrayList<>();
            list.add(set.getKey());
            if(map.containsKey(set.getKey() >= 0 ? set.getKey()-1 : set.getKey()+1)){
                list = map.get(set.getKey() >= 0 ? set.getKey()-1 : set.getKey()+1);
                list.add(set.getKey());
            }
            map.put(set.getKey(),list);
        }
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int m = map.get(nums[i]).size();
                max = Math.max(max,m);
            }
        }
        return max;
    }
}

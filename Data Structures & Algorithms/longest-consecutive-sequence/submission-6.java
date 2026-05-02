class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }

        int count = 0;

        for(int i : set){
            if(set.contains(i - 1)){
                int c = 1;
                while(set.contains(i + 1)){
                    c++;
                    i++;
                }
                count = Math.max(count,c);
            }
        }
        return count+1;
    }
}
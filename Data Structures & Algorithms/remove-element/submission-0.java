class Solution {
    public int removeElement(int[] nums, int val) {
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == val){
                nums[i] = -1;
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == -1){
                continue;
            }
            else{
                list.add(nums[i]);
            }
        }
        int[] result = new int[list.size()];

        for(int i = 0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        int j;
        for(j = 0; j<list.size(); j++){
            nums[j] = result[j];
        }
        return j;
    }
}
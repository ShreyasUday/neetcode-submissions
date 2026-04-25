class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length - 1;
        int i = 0;
        int j = n;

        for(int k = 0; k<=n; k++){
            if(numbers[i]+numbers[j] > target){
                j--;
            }
            else if(numbers[i]+numbers[j] < target){
                i++;
            }
        }
        return new int[]{i+1,j+1};
    }
}

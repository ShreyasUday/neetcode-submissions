class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int low = 0;
        int high = n-1;

        int res = 0;

        Arrays.sort(people);

        while(low<=high){
            if(people[low] + people[high] <= limit){
                res++;
                low++;
                high--;
            }
            else{
                res++;
                high--;
            }
        }
        return res;
    }
}
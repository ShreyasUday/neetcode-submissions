class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> sol = new ArrayList<>();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            if(i>0 && arr[i][0] == arr[i-1][0]) continue;
            int temp = 0 - arr[i][0];
            int j = i + 1;
            int k = n - 1;
            while(j<k){
                int res = arr[j][0] + arr[k][0];
                if(res == temp){
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i][0]);
                    list.add(arr[j][0]);
                    list.add(arr[k][0]);
                    sol.add(list);
                    while(j<k && arr[j][0] == arr[j+1][0]) j++;
                    while(j<k && arr[k][0] == arr[k-1][0]) k--;
                    k--;
                    j++;
                }
                else if(res<temp){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return sol;
    }
}
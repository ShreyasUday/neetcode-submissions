class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int count = 0;
        Set<Character> set = new HashSet<>();
        int low = 0;
        int high = 0;

        while(high<n){
            if(set.contains(s.charAt(high))){
                low++;
                set.remove(s.charAt(low-1));
            }
            else{
                set.add(s.charAt(high));
                high++;
            }
            count = Math.max(count,high-low);
        }
        return count;
    }
}

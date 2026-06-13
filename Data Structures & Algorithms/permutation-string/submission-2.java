public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        HashMap<Character,Integer> m1 = new HashMap<>();
        HashMap<Character,Integer> m2 = new HashMap<>();
        for(char c : s1.toCharArray()){
            m1.put(c,m1.get(c) == null ? 1 : m1.get(c)+1);
        }

        for(int i = 0; i<m; i++){
            m2.put(s2.charAt(i),m2.get(s2.charAt(i)) == null ? 1 : m2.get(s2.charAt(i))+1);
            if(i>=n){
                m2.put(s2.charAt(i-n),m2.get(s2.charAt(i-n))-1);
                if(m2.get(s2.charAt(i-n)) == 0){
                    m2.remove(s2.charAt(i-n));
                }
            }
            if(m2.equals(m1)) return true;
        }
        return false;
    }
}
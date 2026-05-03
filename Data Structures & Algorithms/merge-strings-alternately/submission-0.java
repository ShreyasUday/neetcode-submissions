class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();

        String str2 = "";

        int i = n2-1;

        while(i>=0){
            str2 += Character.toString(word2.charAt(i));
            i--;
        }
        int low1 = 0;
        int low2 = 0;

        String res = "";
        while(low1<n1 && low2<n2){
            res += Character.toString(word1.charAt(low1)) + Character.toString(word2.charAt(low2));
            low1++;
            low2++;
        }

        while(low1<n1){
            res += Character.toString(word1.charAt(low1));
            low1++;
        }

        while(low2<n2){
            res += Character.toString(word2.charAt(low2));
            low2++;
        }

        return res;
    }
}
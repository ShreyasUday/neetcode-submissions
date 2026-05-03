class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        for(int i = 1; i<strs.length; i++){
            if(s.length()>strs[i].length()){
                s = strs[i];
            }
        }
        String res = s;

        int i = 0;
        while(i<strs.length){
            int low = 0;
            String temp = "";

            while(low < s.length() && low < strs[i].length()){
                if(s.charAt(low) == strs[i].charAt(low)){
                    temp += Character.toString((s.charAt(low)));
                }
                else{
                    break;
                }
                low++;
            }
            res = res.length() < temp.length() ? res : temp;
            i++;
        }
        return res;
    }
}
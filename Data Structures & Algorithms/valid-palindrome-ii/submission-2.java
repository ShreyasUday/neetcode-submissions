class Solution {
    public boolean validPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        int lifeLine = 0;

        while(low<=high){
            if(s.charAt(low) == s.charAt(high)){
                low++;
                high--;
                continue;
            }
            else
            {
                int i1 = low;
                int j1 = high;
                Boolean check1 = true;
                while(i1<j1){
                    if(!(s.charAt(i1+1) == s.charAt(j1))){
                        check1 = false;
                        break;
                    }
                    i1++;
                    j1--;
                }
                int i2 = low;
                int j2 = high;
                Boolean check2 = true;
                while(i2<j2){
                    if(!(s.charAt(i2) == s.charAt(j2-1))){
                        check2 = false;
                        break;
                    }
                    i2++;
                    j2--;
                }
                return check1 || check2;
                // if(lifeLine == 0){
                //     if(s.charAt(low+1) == s.charAt(high)){
                //         low++;
                //         lifeLine++;
                //     }
                //     else if(s.charAt(low) == s.charAt(high-1)){
                //         high--;
                //         lifeLine++;
                //     }
                //     else{
                //         return false;
                //     }
                // }
                // else{
                //     return false;
                // }
            }
        }
        return true;
    }
}
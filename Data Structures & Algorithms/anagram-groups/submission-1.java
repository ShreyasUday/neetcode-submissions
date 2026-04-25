class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> res = new ArrayList<>();
        // for(int i = 0; i<strs.length; i++){
        //     List<String> list = new ArrayList<>();
        //     HashMap<Character,Integer> map = new HashMap<>();
        //     int j = 0;
        //     String str = strs[i];
        //     while(j<str.length()){
        //         if(map.containsKey(str.charAt(j))){
        //             map.put(str.charAt(j),map.get(str.charAt(j))+1);
        //         }
        //         else{map.put(str.charAt(j),1);}
        //         j++;
        //     }
        //     int k = 0;
        //     while(k<strs.length){
        //         HashMap<Character,Integer> temp = new HashMap<>();
        //         int l = 0;
        //         String tstr = strs[k];
        //         while(l<tstr.length()){
        //             if(temp.containsKey(tstr.charAt(l))){
        //                 temp.put(tstr.charAt(l),temp.get(tstr.charAt(l))+1);
        //             }
        //             else{temp.put(tstr.charAt(l),1);}
        //             l++;
        //         }
        //         if(map.equals(temp)){
        //             list.add(strs[k]);
        //         }
        //         k++;
        //     }
        //     if(!res.contains(list)){
        //         res.add(list);
        //     }
        // }
        // return res;

        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            char[] chr = strs[i].toCharArray();
            Arrays.sort(chr);
            String str = new String(chr);
            if(!map.containsKey(str)){
                List<String> list = new ArrayList<>();
                map.put(str,list);
            }
            map.get(str).add(strs[i]);
        }
        List<List<String>> res = new ArrayList<>(map.values());
        // res = map.values();
        return res;
    }
}

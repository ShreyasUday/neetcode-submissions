class Solution {

    public String encode(List<String> strs) {
        String res = new String();
        for (int i = 0; i<strs.size(); i++){
            String str = new String(strs.get(i));
            String temp = new String();
            for(int j = 0; j<str.length(); j++){
                temp = temp + Character.toString((str.charAt(j) + 8));
            }
            res = res + temp + " ";
        }
        return res;
    }

    public List<String> decode(String str) {
        String res = new String();
        List<String> list = new ArrayList<>();
        for (int i = 0; i<str.length(); i++){
            if(Character.toString(str.charAt(i)).equals(" ")){
                list.add(res);
                res = "";
                continue;
            }
            res = res + (Character.toString((str.charAt(i) - 8)));
        }
        return list;
    }
}

public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] pArr = path.split("/");
        for(String s : pArr){
            if(s.equals("") || s.equals(".")){
                continue;
            }
            else if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(s);
            }
        }

        StringBuilder res = new StringBuilder();
        for(String str : stack){
            res.append("/").append(str);
        }
        return res.length() == 0 ? "/" : res.toString();
    }
}

/*
1. split on the basis of "/"
*/
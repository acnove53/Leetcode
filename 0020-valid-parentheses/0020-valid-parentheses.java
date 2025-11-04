class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        if (len % 2 != 0) {
            return false;
        }
        Stack<Character> open = new Stack<>();
        for (char e : s.toCharArray()) {
            if (e == '(' || e == '[' || e == '{') {
                open.push(e);
            } else {
                if (open.empty()) {
                    return false;
                }
                String temp = "" + open.pop() + e;
                boolean b = temp.equals("()") || temp.equals("[]") || temp.equals("{}");
                if (!b) {
                    return false;
                }
            }
        }
       return open.empty();
    }
}
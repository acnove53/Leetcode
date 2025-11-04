class Solution {
    public boolean isValid(String s) {
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
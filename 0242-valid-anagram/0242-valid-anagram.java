class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] stringC = s.toCharArray();
        HashMap<Character, Integer> count = new HashMap<>();
        for (char element : stringC) {
            count.put(element, count.getOrDefault(element, 0) + 1);
        }
        stringC = t.toCharArray();
        for (char element : stringC) {
            if (count.containsKey(element) && count.get(element) > 0) {
                count.put(element, count.get(element) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
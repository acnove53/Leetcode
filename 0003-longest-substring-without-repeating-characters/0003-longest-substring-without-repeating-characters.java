class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        Set<Character> check = new HashSet<>();
        int j = 0, max = 1;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (check.contains(c)) {
                while (s.charAt(j) != c) {
                    check.remove(s.charAt(j));
                    j++;
                }
                j++;
            }
            check.add(c);
            int len = i + 1 - j;
            if (len > max) {
                max = len;
            }
        }
        return max;
        // if (s.length() == 0) {
        //     return 0;
        // }
        // int max = 1, j = 0;
        // Map<Character, Integer> check = new HashMap<>();
        // check.put(s.charAt(0), 0);
        // for (int i = 1; i < s.length(); i++) {
        //     char c = s.charAt(i);
        //     int len = i - j + 1;
        //     if (check.containsKey(c)) {
        //         len -= 1;
        //         j = check.get(c) + 1;
        //     }
        //     if (len > max) {
        //         max = len;
        //     }
        
        //     check.put(s.charAt(i), i);
        // }
        // return max;
    }
}
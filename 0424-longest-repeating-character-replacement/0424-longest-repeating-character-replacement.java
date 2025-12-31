class Solution {
    public int characterReplacement(String s, int k) {
        if (s.isEmpty()) {
            return 0;
        }

        int l = 0, res = 0, maxf = 0;
        Map<Character, Integer> freq = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            maxf = Math.max(maxf, freq.get(c));
            if ((r - l + 1) - maxf > k) {
                freq.put(s.charAt(l), freq.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
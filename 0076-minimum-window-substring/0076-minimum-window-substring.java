class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int count = 0;
        int minL = -1, minR = -1;
        int min = Integer.MAX_VALUE;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            System.out.println("r="+r);
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (tMap.containsKey(c) && window.get(c).equals(tMap.get(c))) {
                count++;
            }
            
            while (count == tMap.size()) {
                System.out.println("l="+l);
                if (r - l + 1 < min) {
                    minL = l;
                    minR = r;
                    min = r - l + 1;
                    System.out.println("min=" + min + "LR = " + l + r);
                }

                char c2 = s.charAt(l);
                window.put(c2, window.get(c2) - 1);
                if (tMap.containsKey(c2) && window.get(c2) < tMap.get(c2)) {
                    count--;
                }
                l++;
            }
            
            // if (tMap.containsKey(c)) {
            //     if (window.get(c) == tMap.get(c)) {
            //         while (s.charAt(l) != c) {
            //             if (window.containsKey(s.charAt(l))) {
            //                 window.put(s.charAt(l), window.getOrDefault(s.charAt(l), 0) - 1);
            //             }
            //             l++;
            //         }
            //         window.put(s.charAt(l), window.getOrDefault(s.charAt(l), 0) - 1);
            //         l++;
            //         while (!tMap.containsKey(s.charAt(l))) {
            //             l++;
            //         }
            //     }
            //     window.put(c, window.getOrDefault(c, 0) + 1);
                
            //     if (tMap.equals(window) && (r - l) < (min)) { 
            //         minL = l;
            //         minR = r;
            //         min = r - l;
            //     }
            // }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(minL, minR + 1);   
    }
}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int len = s1.length();
        Map<Character, Integer> check = new HashMap<>();
        for (char c : s1.toCharArray()) {
            check.put(c, check.getOrDefault(c, 0) + 1);
        }
        
        for (int l = 0; l < s2.length() - s1.length() + 1; l++) {
            int count = 0;
            Map<Character, Integer> temp = new HashMap<>();
            int r = l;
            while (r < l + s2.length()) {
                char c = s2.charAt(r);
                temp.put(c, temp.getOrDefault(c, 0) + 1);
                count++;

                if (temp.get(c) > check.getOrDefault(c, 0)) {
                    break;
                }
                if (count == len) {
                    return true;
                }
                r++;
            }
        }
        return false;

        // for (int r = 0; r < s2.length(); r++) {
        //     char c = s2.charAt(
        //     if (check.containsKey(c)) {
        //         if (check.get(c).equals(0)) {
        //             while (check.go)
        //         }
        //         check.put(c, check.get(c) - 1);
        //     } else {
        //         while(l != r) {
        //             if (check.containsKey(s2.charAt(l))) {
        //                 check.put(s2.charAt(l), check.get(s2.charAt(l) + 1));
        //             }
        //             l++;
        //         }
        //     }
        // }

        // for (int r = 0; r < s2.length(); r++) {
        //     char c = s2.charAt(r);
        //     if (check.containsKey(c)) {
        //         if (s2.get(c) > 0) {
        //             check.put(c, check.get(c) - 1);
        //             if (r - l + 1 == s1.length()) {
        //                 return true;
        //             }
        //         } else {
        //             while(check.get(l) != c) {
        //                 check.put(s2.charAt(l), check.get(l) + 1);
        //                 l++;
        //             }
        //             check.put(s2.charAt(l), check.get(l) + 1);
        //             l++;
        //         }
        //     } else {
        //         while(l != r) {
        //             if (check.containsKey())
        //             check.put(s2.charAt(l), check.get(l) + 1);
        //             l++;
        //         }
        //     }
        // }

        //return false;


        // Map<Character, Integer> check = new HashMap<>();
        // for (char c : s1.toCharArray()) {
        //     check.put(c, check.getOrDefault(c, 0) + 1);
        // }

        // Map<Character, Integer> temp = check;
        // int l = 0, r = 0, total = 0;

        // while (r < s2.length()) {
        //     char c = s2.charAt(r);
        //     if (temp.containsKey(c)) {
        //         if (temp.get(c) != 0) {
        //             System.out.print(c);
        //             System.out.println("is in here");
        //             temp.put(c, temp.get(c) - 1);
        //             if (++total == s1.length()) {
        //                 return true;
        //             }
        //             r++;
        //         } else {
        //             while (s2.charAt(l) != c) {
        //                 temp.put(s2.charAt(l), temp.get(s2.charAt(l)) + 1);
        //                 l++;
        //             }
        //         }
                
        //     } else {
        //         System.out.print(r);
        //         System.out.println("nothing");
        //         temp = check;
        //         total = 0;
        //         r++;
        //         l = r;
        //     }
        // }
        // return false;
    }
}
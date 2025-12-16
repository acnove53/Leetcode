class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int up = 0;
        for (int i = 1; i < piles.length; i++) {
            if (piles[up] < piles[i]) {
                up = i;
            }
        }
        up = piles[up];
        int low = 1;
        System.out.println(up);

        //Input: piles = [3,6,7,11], h = 8
        // Output: 4
        double time = 0;
        while (low < up) {
            time = 0;
            int mid = low + ((up - low) / 2);
            for (int bananas : piles) {
                time += (int) Math.ceil((double)bananas / mid);
                if (time > h) {
                    break;
                }
            }
            if (time <= h) {
                up = mid;
                System.out.println("up=" + up);
            } else {
                low = mid + 1;
                System.out.println("down=" + low);
            }
        }
        return up;

        // int speed = 1;
        // while (true) {
        //     double time = 0;
        //     for (int bananas : piles) {
        //         time += Math.ceil((double)bananas / speed);
        //         if (time > h) {
        //             break;
        //         }
        //     }
        //     if (time <= h) {
        //         return speed;
        //     }
        //     speed ++;
        // }
    }
}
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int speed = 1;
        while (true) {
            double time = 0;
            for (int bananas : piles) {
                time += Math.ceil((double)bananas / speed);
                if (time > h) {
                    break;
                }
            }
            if (time <= h) {
                return speed;
            }
            speed ++;
        }
    }
}
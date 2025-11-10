class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        int[][] pair = new int[len][2];
        for (int i = 0; i < len; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a,b) -> Integer.compare(b[0], a[0]));
        Stack<Double> fleet = new Stack<>();
        
        for (int[] i : pair) {
            fleet.push((double) (target - i[0]) / i[1]);
            if (fleet.size() >= 2 && fleet.get(fleet.size() - 2) >= fleet.peek()) {
                fleet.pop();
            }
        }
        return fleet.size();
    }
}
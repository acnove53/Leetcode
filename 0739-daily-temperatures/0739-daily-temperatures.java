class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //stack: 0 1 2 3 4(77) 6(77) 7(41) 
        Stack<Integer> index = new Stack<>();
        for (int i = 0; i < temperatures.length - 1; i++) {
            
            while (!index.empty() && temperatures[index.peek()] < temperatures[i + 1]) {
                int temp = index.pop();
                temperatures[temp] = i + 1 - temp;
            }
            
            if (temperatures [i] < temperatures[i + 1]) {
                temperatures[i] = 1;
            } else {
                index.push(i);
            }
        }
        for (Integer element : index) {
            temperatures[element] = 0;
        }
        temperatures[temperatures.length - 1] = 0;
        return temperatures;
    }
}
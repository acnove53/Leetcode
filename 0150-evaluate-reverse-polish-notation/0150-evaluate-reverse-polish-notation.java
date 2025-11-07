class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> number = new Stack<>();
        for (String element : tokens) {
            int temp;
            switch (element) {
                case "+":
                    temp = number.pop();
                    number.push(number.pop() + temp);
                    break;
                case "-":
                    temp = number.pop();
                    number.push(number.pop() - temp);
                    break;
                case "*":
                    temp = number.pop();
                    number.push(number.pop() * temp);
                    break;
                case "/":
                    temp = number.pop();
                    number.push(number.pop() / temp);
                    break;
                default:
                    number.push(Integer.parseInt(element));
                    break;
            }
        }
        return number.pop();
    }
}
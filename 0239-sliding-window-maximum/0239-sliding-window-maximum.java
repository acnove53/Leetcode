class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new int[] {nums[0]};
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> check = new LinkedList<>();

        int r = 0, l = 0;
        while (r < nums.length) {
            while (!check.isEmpty() && nums[r] >= nums[check.peekLast()]) {
                check.removeLast();
            }
            check.addLast(r);

            if (check.peek() < l) {
                check.removeFirst();
            }
            if (r >= k - 1) {
                res[l] = nums[check.getFirst()];
                l++;
            }
            r++;
            System.out.println(check);
        }

        return res;

        //check.add(nums[0]);
        
        // int r = k - 1, l = 0;
        // while (r < nums.length) {
        //     while (l < r + 1) {
        //         if (check.isEmpty()) {
        //             l = r - k + 1;
        //             check.add(new Pair<>(nums[l], l));
        //         } else if (nums[l] >= check.peekLast().getKey()) {
        //             check.add(new Pair<>(nums[l], l));
        //         }
        //         l++;
        //     }
        //     System.out.println(check);
        //     res[r - k + 1] = check.peekLast().getKey();
        //     r++;
        //     if (check.peek().getValue() < r - k + 1) {
        //         check.poll();
        //     }
        // }

        // return res;


        // Queue<Integer> check = new PriorityQueue<>(Comparator.reverseOrder());

        // for (int i = 0; i < k; i++) {
        //     check.add(nums[i]);
        // }
        // res[0] = check.peek();

        // int r = k;
        // while (r < nums.length) {
        //     check.add(nums[r]);
        //     check.remove(nums[r - k]);
        //     res[r - k + 1] = check.peek();
        //     r++;
        // }
        // return res;


        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < k; i++) {
        //     check.put(nums[i], check.getOrDefault(nums[i], 0) + 1);
        //     if (check.get(nums[i]) > max) {
        //         max = nums[i];
        //     }
        // }
        // res[0] = max;
        // int r = k;

        // while (r < nums.length) {
        //     if (check.get())
        // }

    //     int r = k;
    //     int curr = 0;
    //     for (int i = 0; i < k; i++) {
    //         curr += nums[i];
    //     }
    //     max[0] = curr;

    //     while (r < nums.length) {
    //         int n = nums[r - k] - nums[r - k + 1] + nums[r];
    //         max[r - k + 1] = n;
    //         r++;
    //     }
    //     return max;
    // }
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        //[-4 -1 -1 0 1 2]
        //

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int k = i + 1, j = nums.length - 1;
            while (k < j) {
                int sum = nums[i] + nums[k] + nums[j];
                if (sum > 0) {
                    j--;
                } else if (sum < 0) {
                    k++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[k], nums[j]));
                    j--;
                    k++;
                    while (k < j && nums[k] == nums[k - 1]) {
                        k++;
                    }
                }
            }
        }

        /**
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int k = i + 1, j = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[k] + nums[j];
                
                if (sum > 0) {
                    j--;
                } else if (sum < 0) {
                    k++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[k], nums[j]));
                    j--;
                    k++;
                    while (k < j && nums[k] == nums[k - 1]) {
                        k++;
                    }
                }
            }
        } */


        /**
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            for (int k = i + 1; k < j; k++) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
            }
            if (nums[i] + nums[j] < 0) {
                i++;
            } else {
                j--;
            }
        } */
        /**
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                System.out.printf("%d, %d, %d \n", i, j, k);
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);
                    System.out.print("added!\n");
                }
                k--;
            }
        } */
        return result;
    }
}
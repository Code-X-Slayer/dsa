class BinarySearch {
    private int helper(int[] nums, int target, int st, int end) {
        if (st > end) {
            return -1;
        }
        int m = st + (end - st) / 2;
        if (nums[m] == target) {
            return m;
        } else if (nums[m] > target) {
            return helper(nums, target, st, m - 1);
        } else {
            return helper(nums, target, m + 1, end);
        }
    }

    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }
}
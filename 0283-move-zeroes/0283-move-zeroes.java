class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        int tries = 0;
        while (start < nums.length - tries) {
            if(nums[start] == 0) {
                moveZeroToLast(nums, start);
                tries++;
            } else {
                start++;
            }
        }
    }

    public static void moveZeroToLast(int[] nums, int index) {
        for (int i = index; i < nums.length - 1; i++) {
            int temp = nums[i + 1];
            nums[i + 1] = nums[i];
            nums[i] = temp;
        }
    }
}
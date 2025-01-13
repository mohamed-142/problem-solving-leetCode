class Solution {
    public void moveZeroes(int[] nums) {
        int currentIndex = 0;
        int incrementer = 1;
        while (currentIndex < nums.length) {
            if (nums[currentIndex] == 0 && incrementer < nums.length) {
                if (nums[incrementer] != 0) {
                    int temp = nums[currentIndex];
                    nums[currentIndex] = nums[incrementer];
                    nums[incrementer] = temp;
                    currentIndex++;
                    incrementer++;
                } else {
                    incrementer++;
                }
            } else {
                currentIndex++;
                incrementer++;
            }
        }
    }
}
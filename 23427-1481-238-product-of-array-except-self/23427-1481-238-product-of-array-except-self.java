class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int multiply = 1;
        boolean containsZero = false;
        boolean contains2Zero = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && !containsZero)
                containsZero = true;
            else if (nums[i] == 0 && containsZero)
                contains2Zero = true;
            else
                multiply *= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] != 0 ? (containsZero ? 0 : multiply / nums[i]) : (contains2Zero ? 0 : multiply);
        }
        return result;
    }
}
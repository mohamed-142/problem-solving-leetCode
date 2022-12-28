class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i += 2) {
            ans[i] = nums[n % (nums.length / 2)];
            ans[i+1] = nums[n];
            n++;
        }
        return ans;
    }
}
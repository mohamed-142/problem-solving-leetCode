class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] customer: accounts) {
            max = Math.max(max, Arrays.stream(customer).sum());   
        }
        return max;
    }
}
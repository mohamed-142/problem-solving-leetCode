class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] customer: accounts) {
            max = Arrays.stream(customer).sum() > max ? Arrays.stream(customer).sum() : max;   
        }
        return max;
    }
}
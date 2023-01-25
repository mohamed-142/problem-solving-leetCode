class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i = 0; i < jewels.length(); i++) {
            count += stones.length() - stones.replaceAll("" + jewels.charAt(i), "").length();
        }
        return count;
    }
}
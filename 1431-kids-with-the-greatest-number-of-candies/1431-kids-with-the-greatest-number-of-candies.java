import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        int max = Arrays.stream(candies).max().getAsInt();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies < max) {
                result.add(false);
            } else {
                result.add(true);
            }
        }
        return result;
    }
}
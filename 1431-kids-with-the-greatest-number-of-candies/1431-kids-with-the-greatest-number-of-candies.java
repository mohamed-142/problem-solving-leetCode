import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>(candies.length);
        int max = Arrays.stream(candies).max().getAsInt();
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }
        return result;
    }
}
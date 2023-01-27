import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        // int max = Arrays.stream(candies).max().getAsInt();
        int max = 0;
        for (int i : candies) {
            max = i > max ? i : max;
        }
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }
        return result;
    }
}
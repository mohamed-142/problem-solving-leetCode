import java.util.*;
class Solution {
    public int minimumSum(int num) {
        char[] digits = ("" + num).toCharArray();
        Arrays.sort(digits);
        return Integer.parseInt("" + digits[0] + digits[2]) + Integer.parseInt("" + digits[1] + digits[3]);
    }
}
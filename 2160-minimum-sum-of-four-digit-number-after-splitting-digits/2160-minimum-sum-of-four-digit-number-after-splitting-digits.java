import java.util.*;
class Solution {
    public int minimumSum(int num) {
        Vector < Integer > digits = new Vector < Integer > ();
        while (num != 0) {
            digits.add(num % 10);
            num /= 10;
        }
        
        int min1 = Collections.min(digits);
        digits.remove(Integer.valueOf(min1));
        int min2 = Collections.min(digits);
        digits.remove(Integer.valueOf(min2));

        return min1 * 10 + min2 * 10 + digits.get(0) + digits.get(1);
    }
}
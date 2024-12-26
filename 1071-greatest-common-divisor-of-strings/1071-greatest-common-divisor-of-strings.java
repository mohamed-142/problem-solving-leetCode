class Solution {
    public String gcdOfStrings(String str1, String str2) {
        return (str1 + str2).equals(str2 + str1) ? str1.substring(0, gcd(str1.length(), str2.length())) : "";
    }
    
    public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
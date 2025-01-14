class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        StringBuilder contains = new StringBuilder();
        int i = 0, j = 0;
        for (; i < sArray.length; i++) {
            while (j < tArray.length) {
                if (sArray[i] == tArray[j]) {
                    contains.append(sArray[i]);
                    break;
                }
                j++;
            }
            j++;
        }
        return contains.toString().equals(s);
    }
}
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s: sentences) {
            max = s.split(" ", 0).length > max ? s.split(" ", 0).length : max;
        }
        return max;
    }
}
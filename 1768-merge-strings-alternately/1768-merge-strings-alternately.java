class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int i = 0;
        for(; i < word1.length() && i < word2.length(); i++) {
             result += "" + word1.charAt(i) + word2.charAt(i);
        }
        if(i < word1.length()) {
            result += word1.substring(i);
        } else if (i < word2.length()) {
            result += word2.substring(i);
        }
        return result;
    }
}
class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1 == "") {
            return word2;
        } else if(word2 == "") {
            return word1;
        }
        System.out.println(word1.charAt(0));
        return "" + word1.charAt(0) + word2.charAt(0) +  mergeAlternately(word1.substring(1), word2.substring(1));
    }
}
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder result = new StringBuilder();
        int i = words.length - 1;
        while (i > 0) {
            result.append(words[i]);
            if(!words[--i].isEmpty())
                result.append(" ");
        }
        result.append(words[0]);
        return result.toString();
    }
}
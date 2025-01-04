class Solution {
    public String reverseVowels(String s) {
        List<Character> vowelsList = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int start = 0;
        int end = s.length() - 1;
        char[] chars = s.toCharArray();
        while (start < end) {
            if (!vowelsList.contains(chars[start])) {
                start++;
                continue;
            }

            if (!vowelsList.contains(chars[end])) {
                end--;
                continue;
            }
            char temp = s.charAt(start);
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
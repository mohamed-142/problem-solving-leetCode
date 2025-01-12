class Solution {
    public int compress(char[] chars) {
        char currentChar = chars[0];
        int currentCharIndex = 0;
        int count = 0;
        for (char cr : chars) {
            if (currentChar != cr) {
                chars[currentCharIndex++] = currentChar;
                if (count != 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[currentCharIndex++] = c;
                    }
                }
                currentChar = cr;
                count = 0;
            }
            count++;
        }

        chars[currentCharIndex++] = currentChar;
        if (count > 1) {
            for (char c : String.valueOf(count).toCharArray()) {
                chars[currentCharIndex++] = c;
            }
        }

        return currentCharIndex;
    }
}
class Solution {
    public int mostWordsFound(String[] sentences) {
        return Stream.of(sentences).mapToInt(s -> s.split(" ").length).max().getAsInt();
    }
}
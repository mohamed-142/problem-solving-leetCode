class Solution {
    public String interpret(String command) {
        int i = 0;
        Map<String, String> values = Map.of(
            "G", "G",
            "()", "o",
            "(al)", "al"
        );
        String result = "";
        while (command != "" && i < command.length()) {
            if (values.containsKey(command.substring(i, i+1))) {
                result += values.get(command.substring(i, i+1));
                i++;
            }
            else if (values.containsKey(command.substring(i, i+2))) {
                result += values.get(command.substring(i, i+2));
                i += 2;
            }
            else if (values.containsKey(command.substring(i, i+4))) {
                result += values.get(command.substring(i, i+4));
                i += 4;
            }
        }
        return result;
    }
}
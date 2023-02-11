class Solution {
    public String interpret(String command) {
        
        int i = 0;
        String result = "";
        
        while (i < command.length()) {
            
            if (command.substring(i, i+1).equals("G")) {
                result += "G";
                i++;
            }
            
            else if (command.substring(i, i+2).equals("()")) {
                result += "o";
                i += 2;
            }
            
            else if (command.substring(i, i+4).equals("(al)")) {
                result += "al";
                i += 4;
            }
            
        }
        
        return result;
        
    }
}
package LeetCode.Problem20;

public class Solution {

    private String regularBracket = "()";
    private String squareBracket = "[]";
    private String curlyBracket = "{}";
    private String[] brackets = {regularBracket, squareBracket, curlyBracket};

    private String original_input;
    private String modified_sequence;

    public boolean removeEmptyBrackets() {
        boolean changeMade = false;
        for (String bracket:brackets) {
            int location = modified_sequence.indexOf(bracket);
            if (location>-1) {
                modified_sequence = modified_sequence.substring(0,location)+
                        modified_sequence.substring(location+2,modified_sequence.length());
                changeMade = true;
            }
        }
        return changeMade;
    }


    public boolean isValid(String s) {
        modified_sequence = String.copyValueOf(s.toCharArray());
        boolean need_to_check = true;
        while (need_to_check) {
            need_to_check = removeEmptyBrackets();
        }
        return (modified_sequence.equals(""));
    }
}

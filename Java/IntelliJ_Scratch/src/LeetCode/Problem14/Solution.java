package LeetCode.Problem14;

public class Solution {

    String shortestWord;
    int shortestWordLength;

    public boolean nthCharacterIsEqual(String[] strs, int index) {
        char testChar = shortestWord.charAt(index);
        for (String checkString:strs) {
            if(checkString.charAt(index)!=testChar) {
                return false;
            }
        }
        return true;
    }

    public String shortestWord(String[] strs) {
        this.shortestWord = strs[0];
        for (String word:strs) {
            if (word.length()<shortestWord.length()) {
                this.shortestWord = word;
            }
        }
        this.shortestWordLength = shortestWord.length();
        return shortestWord;
    }

    public String longestCommonPrefix(String[] strs) {
        shortestWord(strs);

        int i = 0;
        while (i<shortestWordLength && nthCharacterIsEqual(strs, i)) {
            i++;
        }
        return shortestWord.substring(0,i);
    }
}

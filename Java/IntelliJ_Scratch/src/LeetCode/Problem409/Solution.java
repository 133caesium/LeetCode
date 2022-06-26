package LeetCode.Problem409;

import java.util.Hashtable;

public class Solution {
    public int longestPalindrome(String s) {
        Hashtable<Character, Integer> letterTable = new Hashtable<Character, Integer>();
        for (char letter:s.toCharArray()) {
            if (letterTable.containsKey(letter)) {
                letterTable.put(letter,letterTable.get(letter)+1);
            } else {
                letterTable.put(letter,1);
            }
        }
        boolean oddLetter = false;
        int palindromeLength = 0;
        for (int count:letterTable.values()) {
            palindromeLength += count/2;
            if (!oddLetter & count % 2 == 1) {oddLetter = true;}
        }
        palindromeLength*=2;
        if (oddLetter) {palindromeLength++;}
        return palindromeLength;
    }
}

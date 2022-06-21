package LeetCode.Problem3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstringLength = 0;
        Set<Character> charSet;
        for (int i = 0; i < s.length(); i++) {
            charSet = new HashSet<Character>();
            char[] characters = s.substring(i).toCharArray();
            for (char character:characters) {
                if (!charSet.add(character)) {
                    longestSubstringLength = Math.max(longestSubstringLength, charSet.size());
                    charSet = new HashSet<Character>();
                    charSet.add(character);
                }
            }
            longestSubstringLength = Math.max(longestSubstringLength, charSet.size());
        }
        return longestSubstringLength;
    }

    public int number_unique_characters(String s) {
        int uniqueCharacters = 0;
        char[] characters = s.toCharArray();
        Set<Character> charSet = new HashSet<Character>();
        for (char character:characters) {
            while (charSet.add(character)) {
                uniqueCharacters++;
            }
        }
        return uniqueCharacters;
    }


    public int lengthOfLongestSubstring_23msSolution(String s) {
        StringBuilder longestSubstring = new StringBuilder();
        int longestSubstringlength = 0;
        char[] characters = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            int duplicateIndex = longestSubstring.indexOf(s.substring(i,i+1));
            if (duplicateIndex>=0) {
                longestSubstringlength = Math.max(longestSubstringlength, longestSubstring.length());
                longestSubstring = new StringBuilder(longestSubstring.substring(duplicateIndex+1));
            }
            longestSubstring.append(s.substring(i,i+1));
        }
        longestSubstringlength = Math.max(longestSubstringlength, longestSubstring.length());
        return longestSubstringlength;
    }
}

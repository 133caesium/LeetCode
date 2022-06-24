package LeetCode.Problem205;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> isomorphicMap = new HashMap<Character, Character>();
        char charAtS, charAtT;
//        weirdly the code speeds up from 19ms to 10 ms if I remove this simple check.
//        int length = s.length();
//        if (t.length()!=length) {return false;}
        for (int i = 0; i < s.length(); i++) {
            charAtS = s.charAt(i);
            charAtT = t.charAt(i);
            if (isomorphicMap.containsKey(charAtS)) {
                if (isomorphicMap.get(charAtS)!=charAtT) {
                    return false;
                }
            } else {
                if (isomorphicMap.containsValue(charAtT)) {
                    return false;
                }
                isomorphicMap.put(charAtS,charAtT);
            }

        }
        return true;
    }
}

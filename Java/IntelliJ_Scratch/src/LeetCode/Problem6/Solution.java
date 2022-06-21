package LeetCode.Problem6;

import java.util.ArrayList;
import java.util.List;

    /*
    Hanlding the trivial cases helps speed up the solution to 6 ms and 42.7 MB
     */


public class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1) {return s;
        } else if (numRows==2) {
            char[] characterArray = s.toCharArray();
            StringBuilder toprow = new StringBuilder();
            StringBuilder bottomrow = new StringBuilder();
            for (int i = 0; i < s.length(); i+=2) {
                toprow.append(characterArray[i]);
                if (i<s.length()-1) {bottomrow.append(characterArray[i+1]);}
            }
            return toprow.append(bottomrow.toString()).toString();
        } else {
            int cycleLength = 2 + 2*(numRows-2);
            return convert_first_pass(s, numRows);
        }
    }

    /*
    This first solution (below) runs in 15 ms, faster than 51.99% at time of posting
    It uses 51.8 MB of RAM, less than 36.25%
     */
    public String convert_first_pass(String s, int numRows) {
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        int rowIndex = 0;
        int direction = 1;
        for (int i = 0; i < s.length(); i++) {
            rows.get(rowIndex).append(s.charAt(i));
            if (numRows==1) {direction=0;}
            if ((rowIndex==(numRows-1) && direction >0 ) || (rowIndex==0 && direction <0)) {
                direction *= -1;
            }
            rowIndex += direction;

        }
        StringBuilder finalString = new StringBuilder();
        for (StringBuilder row:rows) {
            finalString.append(row.toString());
        }
        return finalString.toString();
    }
}

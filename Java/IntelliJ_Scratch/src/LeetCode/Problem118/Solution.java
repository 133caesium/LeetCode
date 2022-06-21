package LeetCode.Problem118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(1));
        for (int row = 1; row < numRows; row++){
            ArrayList<Integer> new_row = new ArrayList<Integer>();
            new_row.add(1);
            for (int i = 1; i < row; i++) {
                List<Integer> previousRow = output.get(row-1);
                new_row.add(previousRow.get(i-1)+previousRow.get(i));
            }
            new_row.add(1);
            output.add(new_row);
        }
        return output;
    }
}


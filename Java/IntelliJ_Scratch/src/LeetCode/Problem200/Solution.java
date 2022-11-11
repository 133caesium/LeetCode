package LeetCode.Problem200;

import java.util.HashSet;

public class Solution {
    char[][] landWater;
    int[][] islandNumbers;
    int height, width;
    int currentIslandNumber = 0;
    int islandsRemoved = 0;

//    public static int[][] directions = new int[][]{{-1,0},{0,1}{0,-1},{-1,0};

    public void changeIslandNumber(int target, int newNumber) {
        islandsRemoved--;
        for (int[] row: this.islandNumbers) {
            for (int pixel: row) {
                if (pixel==target) {pixel=newNumber;}
            }
        }
    }

    public int getIslandNumber(int row, int column) {
        int possibleIslandNumber = 0;
        if (row>0) {possibleIslandNumber = islandNumbers[row-1][column];}
        if (column>0 && islandNumbers[row][column-1]>0) {
            if (possibleIslandNumber==0) {
                possibleIslandNumber = islandNumbers[row][column-1];
            } else if (islandNumbers[row][column-1]>0 && islandNumbers[row][column-1]!=possibleIslandNumber) {
                changeIslandNumber(Math.max(possibleIslandNumber, islandNumbers[row][column-1]),
                        Math.min(possibleIslandNumber, islandNumbers[row][column-1]));
                possibleIslandNumber = Math.min(possibleIslandNumber, islandNumbers[row][column-1]);
            }
        } else if (possibleIslandNumber==0) {
            currentIslandNumber++;
            possibleIslandNumber = currentIslandNumber;
        }
        return possibleIslandNumber;
    }

    public int numIslands(char[][] grid) {
        this.height = grid.length;
        this.width = grid[0].length;
        islandNumbers = new int[height][width];

        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                if (grid[row][column]=='1') {
                    islandNumbers[row][column]=getIslandNumber(row,column);
                }
            }
        }

        HashSet<Integer> islandSet = new HashSet<Integer>();
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                islandSet.add(islandNumbers[row][column]);
            }
        }
        islandSet.remove(0);

        return islandSet.size();
    }
}

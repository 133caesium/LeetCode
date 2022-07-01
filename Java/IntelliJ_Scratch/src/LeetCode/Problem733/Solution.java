package LeetCode.Problem733;

public class Solution {
    int[][] image;
    boolean[][] imageFillCheck;
    int height, width;
    int targetColor, fillColor;

    public void fill(int y, int x) {
        if (0<=y && y<height && 0<=x && x<width && !imageFillCheck[y][x]) {
            if (image[y][x]==targetColor) {
                image[y][x]=fillColor;
                imageFillCheck[y][x]=true;
                fill(y-1,x);
                fill(y+1,x);
                fill(y, x-1);
                fill(y,x+1);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.image = image;
        this.height = image.length;
        this.width = image[0].length;
        this.targetColor = image[sr][sc];
        this.fillColor = color;
        this.imageFillCheck = new boolean[this.height][this.width];
        fill(sr,sc);
        return this.image;
    }
}

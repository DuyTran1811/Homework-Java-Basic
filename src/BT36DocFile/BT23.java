package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BT23 {
    public static void main(String[] args) throws FileNotFoundException {
        var matrix = getMatrix();
        sort(matrix);
        show(matrix);
    }

    private static void sort(int[][] matrix) {
        for (int[] ints : matrix) {
            Arrays.sort(ints);
        }
    }

    private static void show(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMatrix() throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input23.txt");
        var input = new Scanner(file);
        var h = input.nextInt();
        var n = input.nextInt();
        var matrix = new int[h][n];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
}

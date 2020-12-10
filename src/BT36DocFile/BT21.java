package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BT21 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input21.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var str = new String[n][2 * n - 1];
        input.close();
        fill(str);
        show(str);
    }

    private static void show(String[][] str) {
        for (var index : str) {
            for (int i = 0; i < 2 * str.length - 1; i++) {
                System.out.print(index[i]);
            }
            System.out.println();
        }
    }

    private static void fill(String[][] str) {
        for (int i = 1; i <= str.length; i++) {
            for (int j = 1; j <= 2 * str.length - 1; j++) {
                if (i == str.length || j == str.length - i + 1 || j == str.length + i - 1) {
                    str[i - 1][j - 1] = " * ";
                } else {
                    str[i - 1][j - 1] = "   ";
                }
            }
        }
    }
}

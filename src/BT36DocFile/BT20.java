package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BT20 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input20.txt");
        var input = new Scanner(file);
        var h = input.nextInt();
        var str = new String[h][2 * h - 1];
        fill(str);
        show(str);
    }

    private static void show(String[][] str) {
        System.out.println("Hinh Can Ve");
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < 2 * str.length - 1; j++) {
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
    }

    private static void fill(String[][] str) {
        for (int i = 1; i <= str.length; i++) {
            for (int j = 1; j < 2 * str.length; j++) {
                if (j < str.length - i + 1 || j > str.length + i - 1) {
                    str[i - 1][j - 1] = "   ";
                } else {
                    str[i - 1][j - 1] = " * ";
                }
            }
        }
    }

}

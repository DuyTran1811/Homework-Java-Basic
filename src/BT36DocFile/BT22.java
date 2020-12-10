package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BT22 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input22.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var str = new String[n][2 * n - 1];
        input.close();
        fill(str);
        show(str);
    }

    private static void show(String[][] str) {
        for (var d:str) {
            for (int i = 0; i < 2* str.length-1; i++) {
                System.out.print(d[i]);
            }
            System.out.println();
        }
    }

    private static void fill(String[][] str) {
        for (int i = 1; i < str.length; i++) {
            for (int j = 1; j < 2 * str.length; j++) {
                if (j >= str.length - i + 1 && j <= str.length + i - 1) {
                    str[i - 1][j - 1] = " " + (i - Math.abs(str.length - j)) + " ";
                } else {
                    str[i - 1][j - 1] = "   ";
                }
            }
        }
    }
}

package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BT18 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input18.txt");
        var input = new Scanner(file);
        var h = input.nextInt();
        var str = new String[h][h];
        input.close();
        fill(str);
        show(str);
    }

    private static void show(String[][] str) {
        for (var s : str) {
            for (int i = 0; i < str.length; i++) {
                System.out.print(s[i]);
            }
            System.out.println();
        }
    }

    private static void fill(String[][] str) {
        for (int i = 1; i <= str.length; i++) {
            for (int j = 1; j <= str.length; j++) {
                if (j < i) {
                    str[i - 1][j - 1] = "   ";
                } else {
                    str[i - 1][j - 1] = " * ";
                }
            }
        }
    }
}

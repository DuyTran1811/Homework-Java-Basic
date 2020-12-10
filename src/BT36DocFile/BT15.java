package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BT15 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input15.txt");
        var input = new Scanner(file);
        var m = input.nextInt();
        var s1 = new String[m][m];
        Emptysquare(s1);
        showEmptysquare(s1);
    }

    private static void showEmptysquare(String[][] s1) {
        System.out.println("Hinh Can Ve");
        for (var strings : s1) {
            for (int i = 0; i < s1.length; i++) {
                System.out.print(strings[i]);
            }
            System.out.println();
        }
    }

    private static void Emptysquare(String[][] rect) {
        for (int i = 1; i <= rect.length; i++) {
            for (int j = 1; j <= rect.length; j++) {
                if (i == 1 || i == rect.length || j == 1 || j == rect.length
                        || j == i || (i + j) == (rect.length + 1)) {
                    rect[i - 1][j - 1] = " * ";
                } else {
                    rect[i - 1][j - 1] = "   ";
                }
            }
        }
    }
}

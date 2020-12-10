package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BT16 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input16.txt");
        var input = new Scanner(file);
        var m = input.nextInt();
        var str = new String[m][m];
        input.close();
        fillTriangle(str);
        showTriangle(str);
    }

    private static void showTriangle(String[][] str) {
        System.out.println("Hinh Can Ve");
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - i; j++) {
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillTriangle(String[][] str) {
        for (int i = 1; i <= str.length; i++) {
            for (int j = 1; j <= str.length - i + 1; j++) {
                str[i - 1][j - 1] = " * ";
            }
        }
    }
}

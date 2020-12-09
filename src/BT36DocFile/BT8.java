package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input8.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var x = input.nextInt();
        var num = getNumber(n, input);
        input.close();
        if (isExist(num, x)) {
            System.out.println(x + " Xuat Hien Trong Mang");
        } else {
            System.out.println(" Khong Xuat Hien");
        }
    }

    private static boolean isExist(int[] num, int x) {
        for (int j : num) {
            if (j == x) {
                return true;
            }
        }
        return false;
    }

    private static int[] getNumber(int n, Scanner input) {
        var nn = new int[n];
        for (int i = 0; i < n; i++) {
            nn[i] = input.nextInt();
        }
        return nn;
    }
}

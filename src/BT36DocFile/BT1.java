package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input1.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var nuber = getNumber(n, input);
        input.close();
        System.out.println("Cac Phan Tu Ban Dau");
        showArray(nuber);
        System.out.println("Phan Tu Da Duoc Sap Xep");
        Arrays.sort(nuber);
        showArray(nuber);
    }

    private static void showArray(int[] nuber) {
        for (var nu : nuber) {
            System.out.print(nu + " ");
        }
        System.out.println();
    }

    private static int[] getNumber(int n, Scanner input) {
        var num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }
        return num;
    }
}

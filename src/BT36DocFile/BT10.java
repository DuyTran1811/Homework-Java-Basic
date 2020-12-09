package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input10.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var x = input.nextInt();
        var a = input.nextInt();
        var b = input.nextInt();
        var number = getNumber(n, input);
        input.close();
        System.out.println("Phan tu Trong mang");
        showInt(number);
    }

    private static void showInt(int[] number) {
        for (var index : number) {
            System.out.println(index + " ");
        }
    }

    private static int[] getNumber(int n, Scanner input) {
        var num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }
        return num;
    }
}

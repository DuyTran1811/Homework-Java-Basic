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
        System.out.println("\nGiá trị " + x + " xuất hiện " +
                countX(number, x, a, b) + " lần trong đoạn chỉ số [" + a + ", " + b + "].");
    }

    private static int countX(int[] number, int x, int a, int b) {
        var count = 0;
        for (int i = a; i <= b; i++) {
            if (i >= 0 && i < number.length - 1 && number[i] == x) {
                count++;
            }
        }
        return count;
    }

    private static void showInt(int[] number) {
        for (var index : number) {
            System.out.print(index + " ");
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

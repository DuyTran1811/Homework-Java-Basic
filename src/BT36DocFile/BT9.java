package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input9.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var x = input.nextInt();
        var number = getNumber(n, input);
        input.close();
        System.out.println("cac phan tu trong mang");
        show(number);
        System.out.println("\nGia tri X " + x + " So Lan Xuat Hien " + countX(number, x) + " lan ");
    }

    private static int countX(int[] number, int x) {
        var count = 0;
        for (var xx : number) {
            if (xx == x) {
                count++;
            }
        }
        return count;
    }

    private static void show(int[] number) {
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

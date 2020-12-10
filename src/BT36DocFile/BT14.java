package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.function.BiFunction;

public class BT14 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input14.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var number = getNumber(n, input);
        input.close();
        System.out.println("Mang Goc");
        showArray(number);
        System.out.println("\nMang Sau Khi Loc");
        fillter(number);
    }

    private static void fillter(int[] number) {
        for (int i = 0; i < number.length; i++) {
            if (!isExits(number, number[i], i)) {
                System.out.print(number[i] + " ");
            }
        }
    }

    private static boolean isExits(int[] number, int n, int bound) {
        for (int i = 0; i < bound; i++) {
            if (number[i] == n) {
                return true;
            }
        }
        return false;
    }

    private static void showArray(int[] number) {
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

package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input3.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var number = getNumbers(n, input);
        input.close();
        Arrays.sort(number);
        System.out.println("Mang Sau Khi Sap Xep");
        showNumber(number);
        int max2 = findMax(number);
        if (max2 != number[number.length - 1]) {
            showMax(max2, number);
        } else {
            System.out.println("\nKhong co gia tri lon thu 2 trong mang");
        }
    }

    private static void showMax(int max2, int[] number) {
        System.out.println("gia tri max2" + max2);
        System.out.println(" chi so: ");
        for (int i = 0; i < number.length; i++) {
            if (number[i] == max2) {
                System.out.print(i + " ");
            }
        }
    }

    private static int findMax(int[] number) {
        int max = number.length - 1;
        for (int i = number.length - 1; i >= 0; i--) {
            if (number[i] != max) {
                return number[i];
            }
        }
        return max;
    }


    private static void showNumber(int[] number) {
        for (var n : number) {
            System.out.print(n + " ");
        }
    }

    private static int[] getNumbers(int n, Scanner input) {
        var number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = input.nextInt();
        }
        return number;
    }
}

package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input5.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var number = getNumber(n, input);
        input.close();
        System.out.println("\nMang Ban Dau");
        showNumber(number);
        Arrays.sort(number, 0, number.length / 2);
        sorts(number);
        System.out.println("\nMang Sau Khi Thay Doi");
        showNumber(number);
    }

    private static void sorts(int[] number) {
        for (int i = number.length / 2; i < number.length; i++) {
            for (int j = number.length - 1; j > i; j--) {
                if (number[j] > number[j - 1]) {
                    var x = number[j];
                    number[j] = number[j - 1];
                    number[j - 1] = x;
                }
            }
        }
    }

    private static void showNumber(int[] number) {
        for (var index : number) {
            System.out.print(index + " ");
        }
    }

    private static int[] getNumber(int n, Scanner input) {
        var number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = input.nextInt();
        }
        return number;
    }
}

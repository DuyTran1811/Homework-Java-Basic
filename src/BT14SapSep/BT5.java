package BT14SapSep;

import java.util.Arrays;
import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Phan Tu ");
        var n = input.nextInt();
        var number = getNumber(n, input);
        Arrays.sort(number, 0, number.length / 2);
        sort(number);
        System.out.println("Mang Sau Khi Sap Sep");
        show(number);
        if (SymmetryCheck(number)) {
            System.out.println("Mang Doi Sung");
        } else {
            System.out.println("Mang Khong Doi Sung");
        }
    }

    private static boolean SymmetryCheck(int[] number) {
        for (int i = 0; i <= number.length / 2; i++) {
            if (number[i] != number[number.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    private static void sort(int[] number) {
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

    private static int[] getNumber(int n, Scanner input) {
        var number = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan Tu Thu " + (i + 1) + ": ");
            number[i] = input.nextInt();
        }
        return number;
    }

    private static void show(int[] number) {
        for (var n : number) {
            System.out.print(n + " ");
        }
    }
}

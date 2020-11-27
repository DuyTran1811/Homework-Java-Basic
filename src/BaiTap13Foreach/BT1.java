package BaiTap13Foreach;

import java.util.Scanner;

/**
 * Tong Cac Phan Tu Trong Mang
 */
public class BT1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Phan Tu Trong Mang");
        var n = input.nextInt();
        if (n > 0) {
            var number = getNumber(n, input);
            showArray(number);
            var total = totalNumber(number);
            System.out.println("\nTong Cac Phan Tu Trong Mang " + total);
        } else {
            System.out.println("Vui Long Nhap Phan Tu Cua Mang > 0");
        }
    }

    private static long totalNumber(int[] number) {
        var count = 0;
        for (int n : number) {
            count += n;
        }
        return count;
    }

    private static void showArray(int[] number) {
        for (var num : number) {
            System.out.print(num + " ");
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
}

package BaiTap13Foreach;

import java.util.Scanner;

/**
 * Kiem Tra Doi Sung
 */
public class BT3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Phan Tu Cua Mang");
        var n = input.nextInt();
        var number = getNumber(n, input);
        show(number);
        var result = isRevert(number) ? "Mang Doi Sung" : "Mang Khong Doi Sung";
        System.out.println(result);
    }

    private static boolean isRevert(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] != numbers[numbers.length - 1 - i]) {
                return false;
            }
        }
        return true;

    }

    private static int[] getNumber(int n, Scanner input) {
        var number = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan Element " + (i + 1) + ": ");
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

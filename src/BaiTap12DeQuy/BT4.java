package BaiTap12DeQuy;

import java.util.Scanner;

/**
 * Dao Nguoc Cac So
 */
public class BT4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao Day So");
        var n = input.nextInt();
        System.out.println("Day So Da Dao Nguoc");
        reverseNumber(n);
    }

    private static void reverseNumber(int n) {
        if (n > 0) {
            System.out.print(n % 10);
            reverseNumber(n / 10);
        }
    }
}

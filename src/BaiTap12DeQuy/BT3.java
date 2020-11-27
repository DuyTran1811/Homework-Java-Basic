package BaiTap12DeQuy;

import java.util.Scanner;

/**
 * Tinh Tong So Nguyen Duong
 */
public class BT3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var n = input.nextInt();
        System.out.println("Tong Song Nguyen Duong " + sumOfNumbers(n));
    }

    private static int sumOfNumbers(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumOfNumbers(n / 10);
        }
    }
}

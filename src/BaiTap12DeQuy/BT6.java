package BaiTap12DeQuy;

import java.util.Scanner;

/**
 * Tim So Dau Tien
 */
public class BT6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var n = input.nextInt();
        System.out.println("Chu So Dau Tien" + firstNumber(n));
    }

    private static int firstNumber(int n) {
        if (n < 10) {
            return n;
        } else {
            return firstNumber(n /10);
        }
    }
}

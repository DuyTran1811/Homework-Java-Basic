package BaiTap12DeQuy;

import java.util.Scanner;

/**
 * Tong Cac So
 */
public class BT5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var n = input.nextInt();
        System.out.println("Tong Cac Chu So " + totalNumber(n));
    }

    private static int totalNumber(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + totalNumber(n / 10);
        }
    }
}

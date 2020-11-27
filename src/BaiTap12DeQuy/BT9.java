package BaiTap12DeQuy;

import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var n = input.nextInt();
        var sum = total(n);
        System.out.println("S = 1 + ... + n = " + sum);
    }

    private static int total(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + total(n - 1);
        }
    }
}

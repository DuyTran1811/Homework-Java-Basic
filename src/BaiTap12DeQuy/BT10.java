package BaiTap12DeQuy;

import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Nguyen Duong N: ");
        var n = input.nextInt();
        var sum = add(n);
        System.out.println("S = 1 + 1/2 + ... + 1/n = " + sum);
    }

    private static double add(int n) {
        if (n == 1) {
            return n;
        } else {
            return 1.0 / n + add(n - 1);
        }
    }
}

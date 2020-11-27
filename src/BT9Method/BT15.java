package BT9Method;

import java.util.Scanner;

/**
 * Tam Giac Can
 */
public class BT15 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var n = input.nextInt();
        TamGiacCan(n);
    }

    private static void TamGiacCan(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (j < n - i + 1 || j > n + i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}

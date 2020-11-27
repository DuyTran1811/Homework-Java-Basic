package BT9Method;

import java.util.Scanner;

public class BT2 {
    // Phương Thức Kiểm Tra Số Thuận Ngịc Hay Không
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var n = input.nextInt();
        var result = isRevert(n);
        System.out.println(result ? " La Thuan Ngic ":" La So Ngic ");

    }

    private static boolean isRevert(int n) {
        int m = n;
        int rev = 0;
        while (m > 0) {
            rev = rev * 10 + m % 10;
            m /= 10;
        }
        return n == rev;
    }
}

package BaiTap12DeQuy;

import java.util.Scanner;

/**
 * Tim So fibonacci
 */
public class BT2 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So Khong Qua 90");
        var n = scan.nextInt();
        if (n < 0) {
            System.out.println("Gia Tri Khong Phai so Am");
        } else {
            System.out.println("F " + n + " = " + fiboN(n));
        }
    }

    private static long fiboN(int n) {
        if (n < 2) {
            return 1;
        } else {
            return fiboN(n - 1) + fiboN(n - 2);
        }
    }
}

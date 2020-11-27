package BaiTap12DeQuy;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao So Khong Qua 20");
        var n = input.nextInt();
        if (n < 0) {
            System.out.println("Khong Tinh Duoc So Am");
        } else {
            var result = factorial(n);
            System.out.println(result);
        }
    }

    private static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

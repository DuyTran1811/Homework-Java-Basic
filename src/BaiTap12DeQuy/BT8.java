package BaiTap12DeQuy;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 2 So A & B");
        System.out.println("Nhap So A");
        var a = input.nextInt();
        System.out.println("Nhap So B");
        var b = input.nextInt();
        if (a > 0 && b > 0) {
            var result = gcd(a, b);
            System.out.println("Uoc Trung Lon Nhat ( " + a + ", " + b + ") = " + gcd2(a, b));
        } else {
            System.out.println("Vui Long Nhap So Nguy Duong");
        }
    }

    private static int gcd2(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    private static int gcd(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }
}

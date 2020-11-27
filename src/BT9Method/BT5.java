package BT9Method;

import java.util.Scanner;

/**
 * Tính Tổng Của Ba Số Nguyên
 */
public class BT5 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Nhap A");
        var a = scan.nextDouble();
        System.out.println("Nhap B");
        var b = scan.nextDouble();
        System.out.println("Nhap C");
        var c = scan.nextDouble();
        var avg = findAvg(a, b, c);
        System.out.println("Trung Binh 3 So Thuc " + avg);
    }

    private static double findAvg(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}

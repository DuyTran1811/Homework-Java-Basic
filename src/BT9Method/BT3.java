package BT9Method;

import java.util.Scanner;

public class BT3 {
    /**
     * Tìm Số Nhỏ Nhất
     *
     */
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap A");
        var a = input.nextDouble();
        System.out.println("Nhap B");
        var b = input.nextDouble();
        System.out.println("Nhap C");
        var c = input.nextDouble();
        var value = min(a, b, c);
        System.out.println(("min(" + a + ", " + b + ", " + c + ") So Nho Nhat " + value));
    }

    private static double min(double a, double b, double c) {
        double minValue = a;
        if (minValue > b) {
            minValue = b;
        }
        if (minValue > c) {
            minValue = c;
        }
        return minValue;
    }
}

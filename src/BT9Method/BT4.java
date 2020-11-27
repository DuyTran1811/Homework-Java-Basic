package BT9Method;

import java.util.Scanner;

/**
 * Tìm Số Lớn Nhất
 */
public class BT4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So A");
        var a = input.nextDouble();
        System.out.println("Nhap So B");
        var b = input.nextDouble();
        System.out.println("Nhap So C");
        var c = input.nextDouble();
        var value = max(a, b, c);
        System.out.println("Max" + a + " " + b + " " + c + " | So Lon Nhat " + value);
    }

    private static double max(double a, double b, double c) {
        double maxValue = a;
        if (b > maxValue) {
            maxValue = b;
        }
        if (c > maxValue) {
            maxValue = c;
        }
        return maxValue;
    }
}

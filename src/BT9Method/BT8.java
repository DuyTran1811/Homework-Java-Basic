package BT9Method;

import java.util.Scanner;

/**
 * Phương Thức Ước Trung Lớp Nhất Của 2 Số Nguyên Dương
 */
public class BT8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So A");
        var a = input.nextInt();
        System.out.println("Nhap So B");
        var b = input.nextInt();
        System.out.println("Uoc Trung Lon Nhat" +" A "+ a + " B " + b + " La " +gcd(a,b));
    }

    private static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

}

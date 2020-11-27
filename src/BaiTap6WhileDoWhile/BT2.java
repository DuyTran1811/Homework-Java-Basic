package BaiTap6WhileDoWhile;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao So A");
        var a = input.nextInt();
        System.out.println("Nhap Vao So B");
        var b = input.nextInt();
        var cm = a * b;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        var lcm = cm / a;
        System.out.println("UCLN " + a + " BCNN "+lcm);
    }
}

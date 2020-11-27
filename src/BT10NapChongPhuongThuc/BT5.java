package BT10NapChongPhuongThuc;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Nhap Vao 2 So Nguyen");
        System.out.println("Nhap Vao So A");
        var a = scan.nextInt();
        System.out.println("Nhap So B");
        var b = scan.nextInt();
        System.out.println("Phuong Thuc 1 Tham So");
        showResults(a + " + " + b + " = " + (a + b));
        showResults(a + " + " + b + " = ", a + b);
        showResults("Result ", a, b, a + b);


        System.out.println("Nhap Hai So Thuc Double");
        var a1 = scan.nextDouble();
        var b1 = scan.nextDouble();
        System.out.println("Nhap Phuong Thuc 1 Tham So");
        showResults(a1 + " + " + b1 + " = " + (a1 + b1));
        showResults(a1 + " + " + b1 + " = ", a1 + b1);
        showResults("Result" + a1 + " + " + b1 + " = ", a1 + b1);
    }

    public static void showResults(String result) {
        System.out.println(result);
    }

    public static void showResults(String smg, int result) {
        System.out.println(smg + result);
    }

    public static void showResults(String smg, long result) {
        System.out.println(smg + result);
    }

    public static void showResults(String smg, float result) {
        System.out.println(smg + result);
    }

    public static void showResults(String smg, double result) {
        System.out.println(smg + result);
    }

    public static void showResults(String smg, int a, int b, int result) {
        System.out.println(smg + a + " + " + b + " = " + result);
    }

    public static void showResults(String smg, long a, long b, long result) {
        System.out.println(smg + a + " + " + b + " = " + result);
    }

    public static void showResults(String smg, float a, float b, float result) {
        System.out.println(smg + a + " + " + b + " = " + result);
    }

    public static void showResults(String smg, double a, double b, double result) {
        System.out.println(smg + a + " + " + b + " = " + result);
    }
}

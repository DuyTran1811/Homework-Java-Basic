package BT10NapChongPhuongThuc;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var choice = 0;
        do {
            System.out.println("1: Max INT");
            System.out.println("1: Max LONG");
            System.out.println("1: Max FLOAT");
            System.out.println("1: Max DOUBLE");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap A");
                    var a = scan.nextInt();
                    System.out.println("Nhap B");
                    var b = scan.nextInt();
                    System.out.println("Nhap C");
                    var c = scan.nextInt();
                    System.out.println("Max INT " + add(a, b, c));
                    break;
                case 2:
                    System.out.println("Nhap A");
                    var a1 = scan.nextLong();
                    System.out.println("Nhap B");
                    var b1 = scan.nextLong();
                    System.out.println("Nhap C");
                    var c1 = scan.nextLong();
                    System.out.println("Max LONG " + add(a1, b1, c1));
                    break;
                case 3:
                    System.out.println("Nhap A");
                    var a2 = scan.nextFloat();
                    System.out.println("Nhap B");
                    var b2 = scan.nextFloat();
                    System.out.println("Nhap C");
                    var c2 = scan.nextFloat();
                    System.out.println("Max FLOAT " + add(a2, b2, c2));
                    break;
                case 4:
                    System.out.println("Nhap A");
                    var a3 = scan.nextDouble();
                    System.out.println("Nhap B");
                    var b3 = scan.nextDouble();
                    System.out.println("Nhap C");
                    var c3 = scan.nextDouble();
                    System.out.println("Max DOUBLE " + add(a3, b3, c3));
                    break;
            }
        } while (choice != 0);
    }

    private static double add(int a, int b, int c) {
        if (b > a) {
            a = b;
        }
        if (c > a) {
            a = c;
        }
        return a;
    }

    private static double add(long a, long b, long c) {
        if (b > a) {
            a = b;
        }
        if (c > a) {
            a = c;
        }
        return a;
    }

    private static double add(float a, float b, float c) {
        if (b > a) {
            a = b;
        }
        if (c > a) {
            a = c;
        }
        return a;
    }

    private static double add(double a, double b, double c) {
        if (b > a) {
            a = b;
        }
        if (c > a) {
            a = c;
        }
        return a;
    }
}

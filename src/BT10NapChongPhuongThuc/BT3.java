package BT10NapChongPhuongThuc;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var choice = 0;
        do {
            System.out.println("1: Tim Gia Tri Nho Nhat INT");
            System.out.println("2: Tim Gia Tri Nho Nhat LONG");
            System.out.println("3: Tim Gia Tri Nho Nhat FLOAT");
            System.out.println("4: Tim Gia Tri Nho Nhat DOUBLE");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap A");
                    var a = scan.nextInt();
                    System.out.println("Nhap B");
                    var b = scan.nextInt();
                    System.out.println("Nhap C");
                    var c = scan.nextInt();
                    System.out.println("Min INT " + add(a, b, c));
                    System.out.println("============");
                    break;
                case 2:
                    System.out.println("Nhap A");
                    var a1 = scan.nextLong();
                    System.out.println("Nhap B");
                    var b1 = scan.nextLong();
                    System.out.println("Nhap C");
                    var c1 = scan.nextLong();
                    System.out.println("Min Long " + add(a1, b1, c1));
                    System.out.println("=============");
                    break;
                case 3:
                    System.out.println("Nhap A");
                    var a2 = scan.nextFloat();
                    System.out.println("Nhap B");
                    var b2 = scan.nextFloat();
                    System.out.println("Nhap C");
                    var c2 = scan.nextFloat();
                    System.out.println("Min FLOAT " + add(a2, b2, c2));
                    break;
                case 4:
                    System.out.println("Nhap A");
                    var a3 = scan.nextDouble();
                    System.out.println("Nhap B");
                    var b3 = scan.nextDouble();
                    System.out.println("Nhap C");
                    var c3 = scan.nextDouble();
                    System.out.println("Min DOUBLE " + add(a3, b3, c3));
                    break;
            }
        } while (choice != 0);
    }

    public static double add(int a, int b, int c) {
        if (a > b) {
            a = b;
        }
        if (a > c) {
            a = c;
        }
        return a;
    }

    public static double add(long a, long b, long c) {
        if (a > b) {
            a = b;
        }
        if (a > c) {
            a = c;
        }
        return a;
    }

    public static double add(float a, float b, float c) {
        if (a > b) {
            a = b;
        }
        if (a > c) {
            a = c;
        }
        return a;
    }

    public static double add(double a, double b, double c) {
        if (a > b) {
            a = b;
        }
        if (a > c) {
            a = c;
        }
        return a;
    }
}

package BT10NapChongPhuongThuc;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var choice = 0;
        do {
            System.out.println("1: Tinh Tic Cua 2 So INT ");
            System.out.println("2: Tinh Tic Cua 2 So LONG ");
            System.out.println("3: Tinh Tic Cua 2 So FLOAT ");
            System.out.println("4: Tinh Tic Cua 2 So DOUBLE ");
            System.out.println("Nhap 0 De Thoat");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap A");
                    var a = scan.nextInt();
                    System.out.println("Nhap b");
                    var b = scan.nextInt();
                    System.out.println("Tich Cua 2 So Int " + mul(a, b));
                    break;
                case 2:
                    System.out.println("Nha A");
                    var a1 = scan.nextLong();
                    System.out.println("Nha B");
                    var b1 = scan.nextLong();
                    System.out.println("Tich Cua 2 So LONG  " + mul(a1, b1));
                    break;
                case 3:
                    System.out.println("Nhap A");
                    var a2 = scan.nextFloat();
                    System.out.println("Nhap B");
                    var b2 = scan.nextFloat();
                    System.out.println("Tich Cua 2 So FLoat " + mul(a2, b2));
                    break;
                case 4:
                    System.out.println("Nhap A");
                    var a3 = scan.nextDouble();
                    System.out.println("Nhap B");
                    var a4 = scan.nextDouble();
                    System.out.println("Tich Cua 2 So Double "+ mul(a3,a4));
                    break;
            }
        } while (choice != 0);
    }
    protected static int mul(int a, int b) {
        return a * b;
    }

    protected static long mul(long a, long b) {
        return a * b;
    }

    protected static float mul(float a, float b) {
        return a * b;
    }

    protected static double mul(double a, double b) {
        return a * b;
    }
}

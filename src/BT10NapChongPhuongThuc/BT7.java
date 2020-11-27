package BT10NapChongPhuongThuc;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var choice = 0;
        do {
            System.out.println("Nhap Vao 1 Day String");
            var a2 = scan.nextLine();
            System.out.println("so Ky Tu Trong " + length(a2));
            System.out.println();
            System.out.println("1: Nhập Ký Tự Từ 12345678: ");
            System.out.println("2: Nhập Ký Tự Từ 12345678912345L: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap Vao Day So");
                    var a = Integer.parseInt(scan.nextLine());
                    System.out.println("So Ky Tu" + length(a));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Nhap Vao 1 Day So Kieu Long");
                    var a1 = scan.nextLong();
                    System.out.println("So Ky Tu " + length(a1));
                    System.out.println();
                    break;
                default:
                    System.out.println("Khong Co");
            }
        } while (choice != 0);

    }

    private static int length(int n) {
        var count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    private static long length(long n) {
        var count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    private static int length(String str) {
        return str.length();
    }
}

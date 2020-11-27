package BT10NapChongPhuongThuc;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var choice = 0;
        do {
            System.out.println("1: Tam Giac Can ");
            System.out.println("2: Tam Giac Can ");
            System.out.println("3: Tam Giac Can ");
            System.out.println("0: De Thoat ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    TamGiacCan();
                    break;
                case 2:
                    System.out.println("Nhap 1 Ky Tu ");
                    var a = input.next().charAt(0);
                    TamGiacCan(a);
                    break;
                case 3:
                    System.out.println("Nhap Chieu Cao");
                    var n = input.nextInt();
                    System.out.println("Nhap Ki Tu");
                    var c = input.next().charAt(0);
                    TamGiacCan(n, c);
                    break;
            }
        } while (choice != 0);
    }

    private static void TamGiacCan() {
        var height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < 2 * height; j++) {
                if (j < height - i + 1 || j > height + i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    private static void TamGiacCan(char c) {
        var height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < 2 * height; j++) {
                if (j < height - i + 1 || j > height + i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.printf(" %c ", c);
                }
            }
            System.out.println();
        }
    }

    private static void TamGiacCan(int height, char c) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < 2 * height; j++) {
                if (j < height - i + 1 || j > height + i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.printf(" %c ", c);
                }
            }
            System.out.println();
        }
    }

}

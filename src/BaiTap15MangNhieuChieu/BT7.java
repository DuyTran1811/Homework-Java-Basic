package BaiTap15MangNhieuChieu;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao So Canh");
        var h = input.nextInt();
        var SymmetricalTriangle = new String[h][2 * h - 1];
        fill(SymmetricalTriangle);
        display(SymmetricalTriangle);
    }

    private static void display(String[][] symmetricalTriangle) {
        System.out.println("Hinh Can Ve");
        for (String[] strings:symmetricalTriangle) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }

    private static void fill(String[][] symmetricalTriangle) {
        var h = symmetricalTriangle.length;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (j >= h - i + 1 && j <= h + i - 1) {
                    symmetricalTriangle[i - 1][j - 1] = " " + (i - Math.abs(h - j)) + " ";
                } else {
                    symmetricalTriangle[i - 1][j - 1] = "   ";
                }
            }
        }
    }
}

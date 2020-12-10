package BaiTap15MangNhieuChieu;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Canh Cua Tam Giac");
        var h = input.nextInt();
        var isoscelesTriangle = new String[h][2 * h - 1];
        fillIsoscelesTriangle(isoscelesTriangle);
        display(isoscelesTriangle);
    }

    private static void display(String[][] isoscelesTriangle) {
        for (var strings : isoscelesTriangle) {
            for (int j = 0; j < 2 * isoscelesTriangle.length - 1; j++) {
                System.out.print(strings[j]);
            }
            System.out.println();
        }
    }

    private static void fillIsoscelesTriangle(String[][] isoscelesTriangle) {
        var h = isoscelesTriangle.length;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (j < h - i + 1 || j > h + i - 1) {
                    isoscelesTriangle[i - 1][j - 1] = "   ";
                } else {
                    isoscelesTriangle[i - 1][j - 1] = " * ";
                }
            }
        }
    }
}

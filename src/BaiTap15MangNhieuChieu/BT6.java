package BaiTap15MangNhieuChieu;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Canh Cua Tam Giac");
        var h = input.nextInt();
        var hollowTriangle = new String[h][2 * h - 1];
        fillHollowTriangle(hollowTriangle);
        display(hollowTriangle);
    }

    private static void display(String[][] hollowTriangle) {
        System.out.println("Hinh Can Ve");
        for (int i = 0; i < hollowTriangle.length; i++) {
            for (int j = 0; j < 2 * hollowTriangle.length - 1; j++) {
                System.out.print(hollowTriangle[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillHollowTriangle(String[][] hollowTriangle) {
        var h = hollowTriangle.length;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (i == h || j == h - i + 1 || j == h + i - 1) {
                    hollowTriangle[i - 1][j - 1] = " * ";
                } else {
                    hollowTriangle[i - 1][j - 1] = "   ";
                }
            }
        }
    }
}

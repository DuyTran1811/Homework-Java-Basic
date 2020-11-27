package BaiTap15MangNhieuChieu;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Canh Cua Tam Giac");
        var h = input.nextInt();
        var triangle = new String[h][h];
        fillTriangle(triangle);
        displayTriangle(triangle);
    }

    private static void displayTriangle(String[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle.length - i; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillTriangle(String[][] triangle) {
        for (int i = 1; i <= triangle.length; i++) {
            for (int j = 1; j <= triangle.length - i + 1; j++) {
                triangle[i - 1][j - 1] = " * ";
            }
        }
    }
}

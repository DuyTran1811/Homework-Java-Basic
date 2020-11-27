package BaiTap15MangNhieuChieu;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Canh Tam Giac");
        var h = input.nextInt();
        var Triangle = new String[h][h];
        fillTriangle(Triangle);
        display(Triangle);
    }

    private static void display(String[][] triangle) {
        for (String[] strings : triangle) {
            for (int j = 0; j < triangle.length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println();
        }
    }

    private static void fillTriangle(String[][] triangle) {
        for (int i = 1; i <= triangle.length; i++) {
            for (int j = 1; j <= triangle.length; j++) {
                if (j <= triangle.length - i) {
                    triangle[i-1][j-1] = "   ";
                } else {
                    triangle[i-1][j-1] = " * ";
                }
            }
        }
    }
}

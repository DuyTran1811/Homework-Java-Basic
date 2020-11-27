package BaiTap15MangNhieuChieu;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Canh Tam Giac");
        var h = input.nextInt();
        var triangles = new String[h][h];
        fillTriangles(triangles);
        display(triangles);
    }

    private static void display(String[][] triangles) {
        for (int i = 0; i < triangles.length; i++) {
            for (int j = 0; j < triangles.length; j++) {
                System.out.print(triangles[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillTriangles(String[][] triangles) {
        for (int i = 1; i <= triangles.length; i++) {
            for (int j = 1; j <= triangles.length; j++) {
                if (j > i) {
                    triangles[i - 1][j - 1] = "   ";
                } else {
                    triangles[i - 1][j - 1] = " * ";
                }
            }
        }
    }
}

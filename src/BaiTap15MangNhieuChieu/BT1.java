package BaiTap15MangNhieuChieu;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Canh Hinh Vuong");
        var m = input.nextInt();
        var rect = new String[m][m];
        fillRect(rect);
        display(rect);
    }

    private static void display(String[][] rect) {
        System.out.println("Hinh Can Ve");
        for (String[] strings : rect) {
            for (int j = 0; j < rect.length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println();
        }
    }

    private static void fillRect(String[][] rect) {
        for (int i = 1; i <= rect.length; i++) {
            for (int j = 1; j <= rect.length; j++) {
                if (i == 1 || i == rect.length || j == 1 || j == rect.length
                        || j == i || (i + j) == (rect.length + 1)) {
                    rect[i - 1][j - 1] = " * ";
                } else {
                    rect[i - 1][j - 1] = "   ";
                }
            }
        }
    }
}

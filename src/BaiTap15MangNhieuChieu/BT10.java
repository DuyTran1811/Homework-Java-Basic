package BaiTap15MangNhieuChieu;

import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap M");
        var m = input.nextInt();
        System.out.println("Nhap N");
        var n = input.nextInt();
        var matrix = new int[m][n];
        fillMatrix(matrix);
        System.out.println("Ma Tran A");
        display(matrix);
    }

    private static void display(int[][] matrix) {
        for (int[] m : matrix) {
            for (int n:m) {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + j) % 2;
            }
        }
    }
}

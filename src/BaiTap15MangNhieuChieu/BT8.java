package BaiTap15MangNhieuChieu;

import java.util.Arrays;
import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        var matrix = getMatrix();
        sort(matrix);
        display(matrix);
    }

    private static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void sort(int[][] matrix) {
        for (int[] ints : matrix) {
            Arrays.sort(ints);
        }
    }

    /**
     * phương thức dùng để nhập vào các phần tử cho mảng hai chiều và
     * trả về mảng sau khi nhập
     *
     * @return mảng sau khi nhập
     */
    private static int[][] getMatrix() {
        var input = new Scanner(System.in);
        System.out.println("Nhap Cap Ma Tran");
        System.out.println("M");
        var m = input.nextInt();
        System.out.println("N");
        var n = input.nextInt();
        var matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
}

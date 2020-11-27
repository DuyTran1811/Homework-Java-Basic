package BaiTap15MangNhieuChieu;

import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Cap Ma Tran");
        System.out.println("M ");
        var m = input.nextInt();
        System.out.println("N ");
        var n = input.nextInt();
        var matrixA = new int[m][n];
        var matrixB = new int[m][n];
        System.out.println("Nhap Ma Tran A");
        fillMatrix(matrixA, input);
        System.out.println("Nhap Ma Tran B");
        fillMatrix(matrixB, input);
        var matrixTotal = add(matrixA, matrixB);
        System.out.println("Ma Tran A");
        display(matrixA);
        System.out.println("Ma Tran B");
        display(matrixB);
        System.out.println("Tong Ma Tran A & B");
        display(matrixTotal);

    }

    private static void display(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static int[][] add(int[][] matrixA, int[][] matrixB) {
        int[][] total = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                total[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return total;
    }

    private static void fillMatrix(int[][] matrix, Scanner input) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }
    }
}

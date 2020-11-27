package BT14SapSep;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Phan Tu");
        var num = input.nextInt();
        if (num > 0) {
            var grades = getGrades(num, input);
            System.out.println("Mang Truoc Khi Sap Sep");
            showArray(grades);
            sort(grades);
            System.out.println("\nSau Khi Sap Sep");
            showArray(grades);
        }else {
            System.out.println("Nhap Phan Tu Trong Mang > 0");
        }
    }

    private static void sort(float[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] > arr[j - 1]) {
                    var x = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = x;
                }
            }
        }
    }

    private static void showArray(float[] grades) {
        for (var n : grades) {
            System.out.print(n + " ");
        }
    }

    private static float[] getGrades(int num, Scanner input) {
        var number = new float[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Nhap Phan Tu Thu " + (i + 1) + ": ");
            number[i] = input.nextFloat();
            if (number[i] < 0 || number[i] > 10) {
                System.out.println("Nhap Khong Qua 10");
                i--;
            }
        }
        return number;
    }
}

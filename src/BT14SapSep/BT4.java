package BT14SapSep;

import java.util.Arrays;
import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Phan Tu Cua Mang");
        var n = input.nextInt();
        var number = getNumber(n, input);
        System.out.println("Cac Phan Tu Trong Mang");
        Arrays.sort(number);
        showArray(number);
        System.out.println("\nNhap So Can Tim");
        var x = input.nextFloat();
        var index = Arrays.binarySearch(number, x);
        if (index < 0) {
            System.out.println("Kho Co Diem Bang " + x);
        } else {
            System.out.println("co it Nhat 1 Sinh Vien");
        }
    }

    private static void showArray(float[] number) {
        for (var sv : number) {
            System.out.print(sv + " ");
        }
    }

    private static float[] getNumber(int n, Scanner input) {
        var number = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan Tu Thu " + (i + 1) + ": ");
            number[i] = input.nextFloat();
        }
        return number;
    }
}

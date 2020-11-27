package BT14SapSep;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Phan Tu Cua Mang");
        var n = input.nextInt();
        var elements = getElements(n, input);
        System.out.println("Mang Truoc Sap Sep");
        show(elements);
        Arrays.sort(elements);
        System.out.println("\nMang Sau Khi Sap Sep");
        show(elements);
    }

    private static void show(int[] elements) {
        for (var e : elements) {
            System.out.print(e + " ");
        }
    }

    private static int[] getElements(int n, Scanner input) {
        var element = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan Tu Thu : " + (i + 1) + ": ");
            element[i] = input.nextInt();
        }
        return element;
    }
}

package BT14SapSep;

import java.util.Arrays;
import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nham So Phan Tu");
        var n = input.nextInt();
        var element = getElement(n, input);
        Arrays.sort(element);
        System.out.println("Mang Sau Khi Sap Sep");
        showArray(element);
        var max = findMax2(element);
        if (max != element[element.length - 1]) {
            showMax(element, max);
        } else {
            System.out.println("Khong Co Gia Tri Lon Thu 2 Trong Mang");
        }
    }

    private static void showMax(int[] element, int max) {
        System.out.println("Tim Gia Tri Max = " + max);
        System.out.print("Chi So: ");
        for (int i = 0; i < element.length; i++) {
            if (element[i] == max) {
                System.out.println(i + " ");
            }
        }
    }

    private static int findMax2(int[] element) {
        var max = element[element.length - 1];
        for (int i = element.length - 1; i >= 0; i--) {
            if (element[i] != max) {
                return element[i];
            }
        }
        return max;
    }


    private static void showArray(int[] element) {
        for (int i = 1; i < element.length; i++) {
            System.out.print(i+" ");
        }
    }

    /**
     *  phương thức nhập vào danh sách các số nguyên
     * @param n số lượng giá trị cần nhập
     * @param input input đối tượng của lớp Scanner
     * @return mảng các phần tử đã nhập vào
     */
    private static int[] getElement(int n, Scanner input) {
        var number = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan Tu Thu " + (i + 1) + ": ");
            number[i] = input.nextInt();
        }
        return number;
    }
}

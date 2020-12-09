package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input4.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var num = getNum(n, input);
        input.close();
        System.out.println("Mang Sau Khi Sap Xep");
        sortN(num);
        show(num);
        int min2 = findMin(num);
        if (min2 != num[num.length - 1]) {
            showMin(min2, num);
        }else {
            System.out.println("\nkhong co gia tri nho th 2 trong mang");
        }
    }

    private static void showMin(int min2, int[] num) {
        System.out.println("gia tri Min2" + min2);
        System.out.println("chi So");
        for (int i = 0; i < num.length; i++) {
            if (num[i] == min2) {
                System.out.println(i + " ");
            }
        }
    }

    private static int findMin(int[] num) {
        var min = num.length - 1;
        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] != min) {
                return num[i];
            }
        }
        return min;
    }


    private static void show(int[] num) {
        for (var nn : num) {
            System.out.print(nn + " ");
        }
    }

    private static void sortN(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = num.length - 1; j > i; j--) {
                if (num[j] > num[j - 1]) {
                    var x = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = x;
                }
            }
        }
    }

    private static int[] getNum(int n, Scanner input) {
        var nu = new int[n];
        for (int i = 0; i < n; i++) {
            nu[i] = input.nextInt();
        }
        return nu;
    }
}

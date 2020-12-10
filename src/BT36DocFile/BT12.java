package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BT12 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input12.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var number = getNum(n, input);
        input.close();
        Arrays.sort(number, 0, number.length / 2);
        sort(number);
        System.out.println("Mang Sau Khi Sap Xep");
        show(number);
        if (SymmetricTest(number)) {
            System.out.println("La Doi Sung");
        } else {
            System.out.println("Khong Phai Doi Sung");
        }

    }

    private static boolean SymmetricTest(int[] number) {
        for (int i = 0; i < number.length / 2; i++) {
            if (number[i] != number[number.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    private static void sort(int[] number) {
        for (int i = number.length / 2; i < number.length - 1; i++) {
            for (int j = number.length - 1; j > i; j--) {
                if (number[j] > number[j - 1]) {
                    var tmp = number[j];
                    number[j] = number[j - 1];
                    number[j - 1] = tmp;
                }
            }
        }
    }

    private static void show(int[] number) {
        for (var index : number) {
            System.out.print(index + " ");
        }
    }

    private static int[] getNum(int n, Scanner input) {
        var num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }
        return num;
    }
}

package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input2.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        if (n > 0) {
            var num = getNumber(n, input);
            System.out.println(" Diem TB Ban Dau");
            showArray(num);
            sortArray(num);
            System.out.println("\nsau khi sap sep");
            showArray(num);
        }else {
            System.out.println("Phan thu Lon Hon > 0");
        }
        input.close();
    }

    private static void sortArray(float[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = num.length - 1; j > i; j--) {
                if (num[j] > num[j - 1]) {
                    var x = num[j];
                    num[j] = num[j - 1];
                    num[j-1] = x;
                }
            }
        }
    }

    private static void showArray(float[] num) {
        for (var n : num) {
            System.out.print(n + " ");
        }
    }

    private static float[] getNumber(int n, Scanner input) {
        var number = new float[n];
        for (int i = 0; i < n; i++) {
            number[i] = input.nextFloat();
        }
        return number;
    }
}

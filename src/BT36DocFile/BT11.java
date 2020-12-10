package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BT11 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input11.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var x = input.nextInt();
        var number = getNumber(n, input);
        input.close();
        System.out.println("Mang ban Dau");
        show(number);
        var result = Arrays.binarySearch(number, x);
        if (result > 0) {
            System.out.println("Khong co SV nao Bang Diem " + x);
        } else {
            System.out.println(" Co it nhat 1 SV Bang diem " + x);
        }
    }

    private static void show(float[] number) {
        for (var index : number) {
            System.out.print(index + " ");
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

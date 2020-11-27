package BT9Method;

import java.util.Scanner;

public class BT17 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var h = scan.nextInt();
        TamGiacCan(h);
    }

    private static void TamGiacCan(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (j >= h - i + 1 && j <= h + i - 1){
                    System.out.print(" " + (i - Math.abs(h - j)) + " ");
                }else {
                    System.out.println();
                }
            }
        }
    }
}

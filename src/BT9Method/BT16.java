package BT9Method;

import java.util.Scanner;

/**
 * Tam Giac Rong
 */
public class BT16 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var num = input.nextInt();
        TamGiacRong(num);
    }

    private static void TamGiacRong(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 2 * num - 1; j++) {
                if (i == num || j == num - i + 1 || j == num + i - 1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

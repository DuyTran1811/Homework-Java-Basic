package BaiTap7VongLapLongNhau;

import java.util.Scanner;

/**
 * Tam Giac Rong
 */
public class BT6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Tam Giac Rong");
        var h = input.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (i == h || j == h - i + 1 || j == h + i - 1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
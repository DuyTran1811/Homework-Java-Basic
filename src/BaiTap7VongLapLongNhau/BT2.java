package BaiTap7VongLapLongNhau;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Tam Giac Vuong Trai");
        var h = input.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

package BaiTap7VongLapLongNhau;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Tam Giac Vuong Phai Tren");
        var h = input.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h; j++) {
                if (j <= h - i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}

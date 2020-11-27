package BT9Method;

import java.util.Scanner;

/**
 * Tam Giac Vuong Phai
 */
public class BT13 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vap 1 So");
        var h = input.nextInt();
        TamGiacVuongPhai(h);
    }

    private static void TamGiacVuongPhai(int h) {
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j <= h; j++) {
                if (j< i){
                    System.out.print("   ");
                }else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}

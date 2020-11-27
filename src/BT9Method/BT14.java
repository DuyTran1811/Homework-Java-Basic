package BT9Method;

import java.util.Scanner;

public class BT14 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var h = input.nextInt();

        TamgiacVuongDuoi(h);
    }

    private static void TamgiacVuongDuoi(int h) {
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j <= h; j++) {
                if (j <= h - i){
                    System.out.print("   ");
                }else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}

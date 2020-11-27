package BT9Method;

import java.util.Scanner;

/**
 * Phuong Thuc Hinh Vuong Rong
 */
public class BT11 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập X");
        var x = input.nextInt();
        Emptysquare(x);
    }

    private static void Emptysquare(int x)  {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                if (i == 1 || i == x || j == 1 || j == x || i == j || (i + j) == (x + 1)){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
        System.out.println();
        }
    }
}

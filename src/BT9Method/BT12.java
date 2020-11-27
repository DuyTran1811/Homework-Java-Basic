package BT9Method;

import java.util.Scanner;

/**
 * Phương Thức Tam Giác Vuông Góc Trai
 */
public class BT12 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập Vào 1 Số");
        var number = input.nextInt();
        rightTriangle(number);
    }

    private static void rightTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

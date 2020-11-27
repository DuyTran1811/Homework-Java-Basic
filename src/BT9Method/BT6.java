package BT9Method;

import java.util.Scanner;

/**
 * Phương Thức Hiển Thị Đầu Tiên Của Một Số
 */

public class BT6 {
    public static void main(String[] args) {
        var inputNumber = new Scanner(System.in);
        System.out.println("Nhap Vao So Nguyen");
        var number = inputNumber.nextInt();
        showFirstDigit(number);
    }

    private static void showFirstDigit(int number) {
        while (number > 10) {
            number /= 10;
        }
        System.out.println("So Dau Tien N: " + number);
    }
}

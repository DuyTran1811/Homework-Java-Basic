package BT9Method;

import java.util.Scanner;

/**
 * Tính Tổng Các Số Của Một Số Nguyên Dương
 */

public class BT7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao So Nguyen");
        var number = input.nextInt();
        var result = sumDigits(number);
        System.out.println("Tong Cua chu So Nguyen " + result);
    }

    private static int sumDigits(int number) {
        var total = 0;
        while (number > 0) {
            total += number % 10;
            number /= 10;
        }
        return total;
    }
}

package BaiTap5VongFor;
/**
 * Kiem Tra So Nguyen To
 */

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var n = Integer.parseInt(input.nextLine());
        var isPrime = true;
        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " La So Nguyen To");
        } else {
            System.out.println(n + " Khong Phai So Nguyen To");
        }
    }
}

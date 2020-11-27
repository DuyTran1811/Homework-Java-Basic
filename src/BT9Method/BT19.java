package BT9Method;

import java.util.Scanner;

/**
 * Viet Chuong Trinh Liet Ke Cac So Co 6 Chu So
 */
public class BT19 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So A");
        var a = input.nextInt();
        System.out.println("Nhap So B");
        var b = input.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i) && isDigitPrime(i) && isSumNumberPrime(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    count = 0;
                    System.out.println();
                }
            }
        }

    }

    private static boolean isSumNumberPrime(int number) {
        int total = 0;
        while (number > 0) {
            total += number % 10;
            number /= 10;
        }
        return isPrime(total);
    }

    private static boolean isDigitPrime(int number) {
        while (number > 0) {
            if (!isPrime(number % 10)) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}

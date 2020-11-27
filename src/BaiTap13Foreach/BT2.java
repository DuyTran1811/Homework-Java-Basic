package BaiTap13Foreach;

import java.util.Scanner;

/**
 * IN Day So Fibonacci
 */
public class BT2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Luong Can Tim");
        var n = input.nextInt();
        var primeNums = primeNumbers(n);
        showPrime(primeNums);
    }

    private static void showPrime(int[] primeNums) {
        System.out.println("Danh Sach " + primeNums.length + " So Nguyen To Dau Tien");
        for (int num : primeNums) {
            System.out.println(num + " ");
        }
    }

    private static int[] primeNumbers(int n) {
        var prime = new int[n];
        var count = 0;
        var i = 2;
        while (count < n) {
            if (isPrime(i)) {
                prime[count] = i;
                count++;
            }
            i++;
        }
        return prime;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

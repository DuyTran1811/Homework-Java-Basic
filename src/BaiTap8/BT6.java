package BaiTap8;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = 0;
        for (; ; ) {
            System.out.println("Nhap Vao so Nguyen Duong");
            n = input.nextInt();
            var isPrime = true;
            if (n < 2) {
                isPrime = false;
            }
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Gia Tri Thoa Man: " + n);
                break;
            }
        }
    }
}

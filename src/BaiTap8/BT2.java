package BaiTap8;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So Nguyen");
        var n = input.nextInt();
        for (int i = n; i >= 2; i--) {
            var isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && n % i == 0) {
                System.out.println("Gia Tri Thoa Man: " + i);
                break;
            }
        }
    }
}

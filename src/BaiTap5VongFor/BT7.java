package BaiTap5VongFor;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So A");
        var a = Integer.parseInt(input.nextLine());
        System.out.println("Nhap So B");
        var b = Integer.parseInt(input.nextLine());
        System.out.println("Cac So Nguyen To A Va B");
        for (int i = a; i <= b; i++) {
            var isPrime = true;
            if (i < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            System.out.print(isPrime ? i + "," : " ");
        }
    }
}

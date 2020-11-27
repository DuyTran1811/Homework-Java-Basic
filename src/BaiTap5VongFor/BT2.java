package BaiTap5VongFor;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Nguyen Duong");
        var total = 0.0;
        var n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            total += (double) 1 / i;
        }
        System.out.println("S: "+ total);
    }
}

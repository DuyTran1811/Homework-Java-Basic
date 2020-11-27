package BaiTap5VongFor;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);
        int total = 0;
        System.out.println("Nhap Vao So N");
        var n = Integer.parseInt(inputScan.nextLine());
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        System.out.println("Tong Gia Tri N: " + total);
    }
}

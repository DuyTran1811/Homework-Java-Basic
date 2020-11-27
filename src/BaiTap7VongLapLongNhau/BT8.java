package BaiTap7VongLapLongNhau;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap 2 So Nguyen Duong A < B: ");
        System.out.println("Nhap A");
        var a = input.nextInt();
        System.out.println("Nhap B");
        var b = input.nextInt();
        var lowBound = (int) Math.ceil(Math.sqrt(a));
        var hightBound = (int) Math.floor(Math.sqrt(b));
        System.out.println("Cac So Chinh Phuong A Va B: ");
        for (int i = lowBound; i <= hightBound; i++) {
            System.out.println((i * i) + " ");
        }
    }
}

package BaiTap8;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Nguyen Duong A < B Va K != 0 ");
        System.out.println("Nhap So A");
        var a = input.nextInt();
        System.out.println("Nhap So B");
        var b = input.nextInt();
        System.out.println("Nhap So K");
        var k = input.nextInt();
        if (k != 0) {
            var lowBound = (int) Math.ceil(Math.sqrt(a));
            var heightBound = (int) Math.floor(Math.sqrt(b));
            for (int i = lowBound; i <= heightBound; i++) {
                if (i * i % k == 0) {
                    System.out.println("Gia Tri Dau Tien Thoa: " + (i * i));
                    break;
                }
            }
        } else {
            System.out.println("Vui Long Nhap K != 0");
        }
    }
}

package BaiTap3CauTrucifelse;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap A");
        var a = Integer.parseInt(input.nextLine());
        System.out.println("Nhap B");
        var b = Integer.parseInt(input.nextLine());
        System.out.println("Nhap C");
        var c = Integer.parseInt(input.nextLine());
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("La mot tam giac");
        } else {
            System.out.println("Khong Phai Tam Giac");
        }
    }
}

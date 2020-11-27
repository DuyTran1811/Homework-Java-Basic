package BaiTap3CauTrucifelse;

import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.println("Nhap Canh Dau");
        var firstEdge = Integer.parseInt(sw.nextLine());
        System.out.println("Nhap Canh Thu 2");
        var secondEdge = Integer.parseInt(sw.nextLine());
        System.out.println("Nhap Chieu Cao");
        var height = Integer.parseInt(sw.nextLine());
        if (firstEdge > 0 && secondEdge > 0 && height > 0) {
            var area = (firstEdge + secondEdge) * height / 2;
            System.out.println("Dien Tich Hinh Thang " + area);
        } else {
            System.out.println("Xin Vui Long Nhap Lai");
        }
    }
}

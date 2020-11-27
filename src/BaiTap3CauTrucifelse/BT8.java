package BaiTap3CauTrucifelse;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Vao 1 Chuoi");
        var string = scanner.nextLine();
        if (string.charAt(0) == string.charAt(string.length() - 1)) {
            System.out.println("Ki Tu Dau Va Cuoi Trung Nhau");
        }else {
            System.out.println("Ki Tu Dau Va Cuoi Khong Trung Nhau");
        }
    }
}

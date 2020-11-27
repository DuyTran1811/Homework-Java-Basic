package BaiTap1String;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Chuoi 1");
        String str1 = scanner.nextLine();
        System.out.println("Nhap Chuoi 2");
        String str2 = scanner.nextLine();
        System.out.println(str1.indexOf(str2));
    }
}

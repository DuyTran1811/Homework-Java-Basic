package BaiTap1String;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Vao 1 Chuoi");
        String string = scanner.nextLine();
        int index1 = string.length();
        System.out.println("Vi Chi Dau Tien\n" + string.charAt(0));
        int lasindex = string.length() - 1;
        System.out.println("Vi tri Phan tu cuoi Cung\n" + lasindex +" "+ string.charAt(lasindex));
    }
}

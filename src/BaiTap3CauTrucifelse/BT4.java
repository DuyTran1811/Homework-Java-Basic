package BaiTap3CauTrucifelse;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap String 1");
        var str1 = input.nextLine();
        System.out.println("Nhap String 2");
        var str2 = input.nextLine();
        var result = str1.compareTo(str2);
        if (result > 0) {
            System.out.println("Chuỗi str1 đứng trước str2");
        } else if (result == 0) {
            System.out.println("Chuoi str1 bang chuoi str2");
        } else {
            System.out.println("Chuoi 1 dung sau chuoi 2");
        }
    }
}

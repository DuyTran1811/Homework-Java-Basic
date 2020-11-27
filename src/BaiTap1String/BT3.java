package BaiTap1String;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi");
       String str = sw.nextLine();
        System.out.println(str.replaceAll("\\s+"," * "));
    }
}

package BaiTap1String;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap Ho Ten");
        String str1 = scan.nextLine();
        System.out.println(str1.replaceAll("\\s+"," * "));
    }
}

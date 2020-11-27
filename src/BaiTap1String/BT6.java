package BaiTap1String;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.println("Nhap Chuoi String");
        String str = sw.nextLine();
        System.out.println(str.replaceAll("\\s+","\n"));
    }
}

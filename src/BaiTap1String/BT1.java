package BaiTap1String;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap Vao 1 Chuoi");
       String str = scan.nextLine();
        System.out.println("Độ dài của chuỗi là: "+str.length());
    }
}

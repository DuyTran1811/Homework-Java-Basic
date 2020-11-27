package BaiTap5VongFor;

import java.util.Scanner;

public class BT5 {
    // Hiển Thị String Theo Thứ Tự Ngược Lại
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao Mot Chuoi");
        var str = input.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i)+" ");
        }
    }
}

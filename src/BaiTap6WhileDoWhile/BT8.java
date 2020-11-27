package BaiTap6WhileDoWhile;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var n = input.nextInt();
        while (n > 10) {
            n /= 10;
        }
        System.out.println("So Dau Tien : " + n);
    }
}

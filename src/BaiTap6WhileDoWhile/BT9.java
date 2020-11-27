package BaiTap6WhileDoWhile;

import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var n = input.nextInt();
        var total = n % 10;
        while (n > 10) {
            n /= 10;
        }
        total += n;
        System.out.println("To Chu So Dau Cuoi " + total);
    }
}

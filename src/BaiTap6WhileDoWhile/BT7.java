package BaiTap6WhileDoWhile;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var n = input.nextInt();
        int i = 1;
        var total = 0.0;
        while (i <= n) {
            total += 1.0 / (i * i);
            i++;
        }
        System.out.println("Total = " + total);
    }
}

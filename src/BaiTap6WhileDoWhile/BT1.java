package BaiTap6WhileDoWhile;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var n = input.nextInt();
        int i = 1;
        System.out.println("Cac Uoc So Tu Nhien");
        while (i <= n) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

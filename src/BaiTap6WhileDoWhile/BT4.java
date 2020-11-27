package BaiTap6WhileDoWhile;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 Chuoi");
        var str = input.nextLine();
        int i = str.length() - 1;
        while (i >= 0) {
            System.out.print(str.charAt(i)+" ");
            i--;
        }
    }
}

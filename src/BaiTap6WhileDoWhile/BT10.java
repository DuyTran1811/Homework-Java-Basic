package BaiTap6WhileDoWhile;

import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var n = input.nextInt();
        var total = 0;
        //  mỗi khi chia nguyên cho 10
        // thì ta đếm đc thêm 1 chữ số của n
        while (n > 0) {
            n /= 10;
            total++;
        }
        System.out.println("So Chu So N = " + total);
    }
}

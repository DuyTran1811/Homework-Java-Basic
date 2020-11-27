package BaiTap6WhileDoWhile;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        System.out.println("Nhap Vao 1 So Nguyen");
        var input = new Scanner(System.in);
        var n = input.nextInt();
        var total = 0;
        while (n > 0) {
            total += n % 10; //lấy phần đơn vị của n
            n /= 10;        //loại bỏ phần đơn vị đã lấy của n
        }
        System.out.println("Total = " + total);
    }
}

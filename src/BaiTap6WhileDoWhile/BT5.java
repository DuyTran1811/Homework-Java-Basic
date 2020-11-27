package BaiTap6WhileDoWhile;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var total = 0;
        var n = -1;
        while (n != 0) {
            System.out.println("Nhap 0 De Thoat Nhap Gia Tri Khac De Cong ");
            n = Integer.parseInt(input.nextLine());
            total += n;
        }
        System.out.println("Tong Cac So Da Nhap: " + total);
    }
}

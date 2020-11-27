package BaiTap3CauTrucifelse;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 Chuoi");
        var string = input.nextLine();
        if (string.matches("^[A-Z]+.*")) {
            System.out.println("Ten Bat Dau Chu Cai Hoa: ");
        } else {
            System.out.println("Ten Khong Bat Dau Chu Cai Hoa");
        }
    }
}

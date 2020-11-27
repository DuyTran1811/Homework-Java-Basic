package BaiTap3CauTrucifelse;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 Chuoi");
        var str = input.nextLine();
        if (str.matches("^\\s+.*")){
            System.out.println("Chuỗi Bắt Đầu Khoảng Trắng");
        }else {
            System.out.println("Chuỗi bắt đầu bằng kí tự khác khoảng trắng");
        }
    }
}

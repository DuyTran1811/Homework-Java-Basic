package BaiTap3CauTrucifelse;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 Chuoi");
        String fullName = input.nextLine();
        if (fullName.matches(".*[a-zA-Z\\s]+.*")) {
            System.out.println("Ho Ten Khong Hop Le");
        }else {
            System.out.println("Ho Ten Ho Le");
        }
    }
}

package BT9Method;

import java.util.Scanner;

public class BT1 {
    // Phương Thức Hiện Thị Chuỗi String Theo Thứ Tự Ngược Lại
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao Mot String: ");
        var str = input.nextLine();
        showRevert(str);
    }

    private static void showRevert(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}

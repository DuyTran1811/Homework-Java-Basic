package BaiTap12DeQuy;

import java.util.Scanner;

/**
 * Dao Nguoc Chuoi
 */
public class BT7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao chuoi");
        var str = input.nextLine();
        showRevert(str, str.length() - 1);
    }

    private static void showRevert(String str, int pos) {
        if (pos >= 0) {
            System.out.print(str.charAt(pos));
            showRevert(str, pos - 1);
        }
    }
}

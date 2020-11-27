package BaiTap5VongFor;

import java.util.Scanner;

/**
 * Kiem Tra So Hoan Hao
 */
public class BT8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        var n = input.nextInt();
        var revert = 0;
        for (int i = n; i > 0; i /= 10) {
            revert += revert * 10 + i % 10;
        }
        System.out.println(n == revert ? "La So Dep" : " Khong Phai So Dep");
    }
}

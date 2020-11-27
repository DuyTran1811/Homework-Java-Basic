package BaiTap13Foreach;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 Chuoi");
        var str = input.nextLine();
        String[] words = str.split("\\s+");
        System.out.println("In Theo Thu Tu Nguoc Lai");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}

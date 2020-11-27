package BaiTap13Foreach;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 Chuoi");
        var str = input.nextLine();
        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            System.out.println(i + " - " + words[i]);
        }
    }
}

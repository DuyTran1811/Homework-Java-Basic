package BaiTap5VongFor;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao Mot Chuoi");
        var str = input.nextLine();
        str = str.trim();
        str = str.replace("\\s+", " ");
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                System.out.println(str.charAt(i));
            }
            if (str.charAt(i) == ' ') {
                System.out.println(str.charAt(i + 1));
            }
        }
    }
}

package BT14SapSep;

import java.util.Scanner;

/**
 * Truong Trinh Dem So Ky Tu Xuat Hien Bao Nhieu Lan Trong Chuoi
 */
public class BT8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 Chuoi");
        var str = input.nextLine();
        countLetters(str);
    }

    private static void countLetters(String str) {
        System.out.println("Cac Ky Tu Va So Lan Xuat Hien Tuong Ung");
        for (int i = 0; i < str.length(); i++) {
            if (!isExits(str, str.charAt(i), i)) {
                var result = count(str, str.charAt(i));
                System.out.println("\"" + str.charAt(i) + "\"" + ": " + result);
            }
        }
    }

    private static int count(String str, char charKey) {
        var counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == charKey) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean isExits(String str, char c, int bounds) {
        for (int i = 0; i < bounds; i++) {
            if (str.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
}

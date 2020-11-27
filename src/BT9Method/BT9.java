package BT9Method;

import java.util.Scanner;

/**
 * Phuong Thuc Den So Tu Cua Mot Cau Nhap Tu Ban Phim
 */
public class BT9 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap 1 Chuoi String");
        var str = input.nextLine();
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        System.out.println("So Tu Cua Cau " + countWord(str));
    }

    private static int countWord(String str) {
        var count = 0;
        if (!str.isEmpty()) {
            count++;
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)== ' ')
            count++;
        }
        return count;
    }
}

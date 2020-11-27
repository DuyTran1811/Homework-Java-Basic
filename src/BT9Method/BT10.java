package BT9Method;

import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao 1 Chuoi");
        var str = input.nextLine().toLowerCase();
        System.out.println(countVowl(str));
    }

    private static int countVowl(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'i') {
                count++;
            }
        }
        return count;
    }
}

package BaiTap13Foreach;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Nguoi Ban Cua Ban");
        var size = input.nextLine();
        String[] words = size.split("\\s+");
        showResult(words);
    }

    private static void showResult(String[] words) {
        var min = FinmaxSize(words);
        System.out.println("Nguoi Co Ten Ngan Nhat La");
        for (var f : words) {
            if (f.length() == min) {
                System.out.println(f);
            }
        }
    }


    private static int FinmaxSize(String[] friends) {
        var minSize = friends[0].length();
        for (String friend : friends) {
            if (friend.length() < minSize) {
                minSize = friend.length();
            }
        }
        return minSize;
    }
}

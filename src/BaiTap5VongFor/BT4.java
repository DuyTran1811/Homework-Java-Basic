package BaiTap5VongFor;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        System.out.println("Nhap Vao 1 Chuoi");
        Scanner scan = new Scanner(System.in);
        var str = scan.nextLine();
        var count = 0;
        str = str.trim();
        // thay thế 1 hoặc nhiều dấu cách giữa bằng 1 dấu cách
        str = str.replace("\\s+", " ");
        if (!str.isEmpty()) {
            count = 1;
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') // Kiem Tra Giau Cach
                count++;
        }
        System.out.println("Chuoi Chuan Hoa: \"" + str + "\"");
        System.out.println("So Tu: " + count);
    }
}

package BaiTap8;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Nguyen Duong K,M <= 100: ");
        // Tim uoc so Nguyen To nho nhat cua n
        System.out.println("Nhap So K");
        var k = input.nextInt();
        System.out.println("Nhap So M");
        var m = input.nextInt();
        //Khoi Tao Bien Dem
        var count = 0;
        for (int i = 10000; i <= 99999; i++) {
            int j = i;
            int sumDigits = 0;
            while (j > 0) {
                sumDigits += j % 10;
                j /= 10;
            }
            if (sumDigits % m == 0) {
                System.out.println(i + " ");
                count++;
                if (count >= k) {
                    break;
                }
            }
        }
    }
}

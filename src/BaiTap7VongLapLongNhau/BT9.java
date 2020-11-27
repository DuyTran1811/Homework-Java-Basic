package BaiTap7VongLapLongNhau;

import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Chinh Phuong");
        var n = input.nextInt();
        if (n < 2 || n > 9) {
            System.out.println("Vui Long Nhap Trong Doan 2 Den 9");
        } else {
            int count = 0;
            var from = (long) Math.pow(10, n - 1);
            var to = (long) Math.pow(10, n) - 1;
            for (long i = from; i <= to; i++) {
                long rev = 0;
                long j = i;
                while (j > 0) {
                    rev = rev * 10 + j % 10;
                    j /= 10;
                }
                if (rev == i) {
                    count++;
                    System.out.print(i + " ");
                    if (count % 10 == 0) {  // mỗi hàng in ra 10 số
                        count = 0;     // reset biến đếm giá trị
                        System.out.println();
                    }
                }
            }
        }
    }
}

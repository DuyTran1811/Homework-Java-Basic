package BaiTap5VongFor;

import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So A");
        var a = input.nextInt();
        System.out.println("Nhap So B");
        var b = input.nextInt();
        for (int i = a; i <= b; i++) {
            long f0 = 0;
            long f1 = 1;
            long fn = (i < 2) ? i : 0; //nếu i < 2, fn = n
            for (int j = 2; j <= i; j++) {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
            }
            System.out.println("F " + i + " = " + fn);
        }
    }
}

package BaiTap6WhileDoWhile;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        double a = 0;
        double b, c;
        while (a == 0) {
            System.out.println("Nhap So Khac 0");
            a = input.nextDouble();
        }
        System.out.println("Nhap He So B Va C");
        System.out.println("Nhap B");
        b = input.nextDouble();
        System.out.println("Nhap C");
        c = input.nextDouble();
        // giải biện luận pt bậc hai:
        var delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong Trinh Vo Ngiem");
        } else if (delta == 0) {
            System.out.println("Phuong Tri Co Nghiem Kep");
            System.out.println("X = " + (-b / (2 * a)));
        } else {
            var x1 = (-b + Math.sqrt(delta) / (2 * a));
            var x2 = (-b - Math.sqrt(delta) / (2 * a));
            System.out.println("Nghiem Cua Phuong Trinh: ");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }
    }
}

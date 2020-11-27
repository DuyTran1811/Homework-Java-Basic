package BaiTap2SuDungLopMath;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap A");
        double a = Integer.parseInt(input.nextLine());
        System.out.println("Nhap B");
        double b = Integer.parseInt(input.nextLine());
        System.out.println("Ke Qua Lam tron len " + Math.round(a / b));
    }
}

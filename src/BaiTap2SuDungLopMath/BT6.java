package BaiTap2SuDungLopMath;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        System.out.println("Nhap A");
        int a = Integer.parseInt(inout.nextLine());
        System.out.println("Nhap So B");
        int b = Integer.parseInt(inout.nextLine());
        System.out.println("A^B " + Math.pow(a, b));
        System.out.println("B^A " + Math.pow(b, a));
    }
}

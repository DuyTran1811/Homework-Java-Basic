package BaiTap2SuDungLopMath;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap So Cua Ban");
        int r = Integer.parseInt(input.nextLine());
        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * r * r;
        System.out.println("Tinh Chu Vi " + perimeter);
        System.out.println("Tinh Dien Tic " + area);
    }
}

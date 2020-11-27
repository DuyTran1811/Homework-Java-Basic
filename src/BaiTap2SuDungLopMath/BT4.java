package BaiTap2SuDungLopMath;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap So Cua Ban");
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        System.out.println("Gia Tri Min " + Math.min(a, b));
        System.out.println("Gia Tri Max " + Math.max(a, b));
    }
}

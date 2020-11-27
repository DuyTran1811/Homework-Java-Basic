package BaiTap2SuDungLopMath;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap number");
        var number = Integer.parseInt(input.nextLine());
        System.out.println("Can Bac 2 la " + Math.sqrt(number));
        System.out.println("Can Bac 3 la " + Math.cbrt(number));
    }
}

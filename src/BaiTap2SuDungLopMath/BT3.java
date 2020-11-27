package BaiTap2SuDungLopMath;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Number");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Sin " + Math.sin(Math.toRadians(x)));
        System.out.println("Cos " + Math.cos(Math.toRadians(x)));
        System.out.println("Tan " + Math.tan(Math.toRadians(x)));
    }
}

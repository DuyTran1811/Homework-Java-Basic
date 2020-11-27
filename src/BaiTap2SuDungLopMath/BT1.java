package BaiTap2SuDungLopMath;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Number");
        var number = Integer.parseInt(input.nextLine());
        System.out.println("Gia Chi Tuye Doi " + Math.abs(number));
    }
}

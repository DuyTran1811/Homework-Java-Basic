package BaiTap2SuDungLopMath;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so");
        int number = Integer.parseInt(input.nextLine());
        int random = (int) (Math.random() * Math.pow(10, number));
        int result = random % number;
        System.out.println("random: " + result);
    }
}

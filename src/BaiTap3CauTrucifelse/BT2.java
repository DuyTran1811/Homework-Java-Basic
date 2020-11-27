package BaiTap3CauTrucifelse;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap A");
        var a = Integer.parseInt(input.nextLine());
        System.out.println("Nhap B");
        var b = Integer.parseInt(input.nextLine());
        if (a > b) {
            System.out.println(a + " A Lon Hon B " + b);
        } else if (a == b) {
            System.out.println(a + " A Bang B " + b);
        }else {
            System.out.println(" A Nho Hon B ");
        }
    }
}

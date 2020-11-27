package BaiTap3CauTrucifelse;

import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Tien");
        var guess = Integer.parseInt(scanner.nextLine());
        var moneyArea = 152 * 65 * 0.01 * 0.01;
        var buidingArea = 72 * 12 * 80;
        var needed = Math.ceil(buidingArea / moneyArea);
        System.out.println("So Tien Can Thiet " + needed / 2);
        if ((guess >= needed / 2) && (guess <= needed / 2+100)) {
            System.out.println("Chinh Xac");
        } else {
            System.out.println("Khong Chinh Xac");
        }
    }
}

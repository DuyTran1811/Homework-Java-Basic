package BaiTap6WhileDoWhile;

import java.util.Scanner;

public class BT11 {
    public static void main(String[] args) {
        int choice;
        var input = new Scanner(System.in);
        do {
            System.out.println("Nhap Thang tu 1 den 12");
            choice = Integer.parseInt(input.nextLine());
            var season = "";
            switch (choice) {
                case 0:
                    System.out.println("Ket Thuc");
                    break;
                case 1:
                case 2:
                case 3:
                    season = "Mua Xuan";
                    break;
                case 4:
                case 5:
                case 6:
                    season = "Mua Ha";
                    break;
                case 7:
                case 8:
                case 9:
                    season = "Mua Thu";
                    break;
                case 10:
                case 11:
                case 12:
                    season = "Mua Dong";
                    break;
                default:
                    System.out.println("Giá trị không hợp lệ. Vui lòng nhập giá trị trong đoạn [0-12]");
            }
            if (!season.isEmpty())
                System.out.println("Thang " + choice + " la " + season);
        } while (choice != 0);
    }
}

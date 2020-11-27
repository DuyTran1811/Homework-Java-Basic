package BaiTap4SwichCase;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so 0 - 12");
        var number = Integer.parseInt(input.nextLine());
        var season = "";
        switch (number) {
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
                System.out.println("Gia Tri Khong Hop Le");
        }
        if (!season.isEmpty()) {
            System.out.println(" Thang " + number + " La " + season);
        }
    }
}

package BaiTap6WhileDoWhile;

import java.util.Scanner;

public class BT13 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var choice = 0;

        while (true) {
            System.out.println("=======================");
            System.out.println("Nhap 0 De Thoat Nhap So Khac De Tiep Tuc");
            choice = input.nextInt();
            if (choice == 0) {
                System.out.println("Ket Thuc");
                break;
            }
            System.out.println("Nhap Ngay Thang Nam Sinh");
            var day = input.nextInt();
            var month = input.nextInt();
            System.out.println("Ngay Sinh Cua Ban " + day + " / " + month);
            var zodiac = "";
            switch (month) {
                case 1:
                    if (day < 20) {
                        zodiac = "Ma Ket";
                    } else if (day <= 31) {
                        zodiac = "Bao Binh";
                    } else {
                        System.out.println("Ngay Nay Khong Ton tai");
                    }
                    break;
                case 2:
                    if (day < 19) {
                        zodiac = "Bao Binh";
                    } else if (day <= 29) {
                        zodiac = "Song Ngu";
                    } else {
                        System.out.println("Ngay Nay Khong Ton tai");
                    }
                    break;
                case 3:
                    if (day < 21) {
                        zodiac = "Song Ngu";
                    } else if (day <= 31) {
                        zodiac = "Bach Duong";
                    } else {
                        System.out.println("Ngay nay khong ton Tai");
                    }
                    break;
                case 4:
                    if (day < 21) {
                        zodiac = "Bach Duong";
                    } else if (day <= 30) {
                        zodiac = "Kim Nguu";
                    } else {
                        System.out.println("Ngay Nay Khong Ton Tai");
                    }
                    break;
                case 5:
                    if (day < 21) {
                        zodiac = "Kim Nguu";
                    } else if (day <= 30) {
                        zodiac = "Song Tu";
                    } else {
                        System.out.println("Ngay Nay Khong Ton Tai");
                    }
                    break;
                case 6:
                    if (day < 22) {
                        zodiac = "Song Tu";
                    } else if (day <= 30) {
                        zodiac = "Cu Giai";
                    } else {
                        System.out.println("Ngay Khong Ton Tai");
                    }
                    break;
                case 7:
                    if (day < 23) {
                        zodiac = "Cu Giai";
                    } else if (day <= 31) {
                        zodiac = "Su Tu";
                    } else {
                        System.out.println("Ngay Nay Khong Ton Tai");
                    }
                    break;
                case 8:
                    if (day < 23) {
                        zodiac = "Su Tu";
                    } else if (day <= 31) {
                        zodiac = "Su Nu";
                    } else {
                        System.out.println("Ngay Nay Khong Ton Tai");
                    }
                    break;
                case 9:
                    if (day < 23) {
                        zodiac = "Su Nu";
                    } else if (day <= 30) {
                        zodiac = "Thien Binh";
                    } else {
                        System.out.println("Ngay Nay Khong Ton Tai");
                    }
                    break;
                case 10:
                    if (day < 24) {
                        zodiac = "Thien Binh";
                    } else if (day <= 31) {
                        zodiac = "Ho Cap";
                    } else {
                        System.out.println("Ngay Nay Khong Ton Tai");
                    }
                    break;
                case 11:
                    if (day < 23) {
                        zodiac = "Ho Cap";
                    } else if (day <= 31) {
                        zodiac = "Nhan Ma";
                    } else {
                        System.out.println("Ngay Nay Khong Ton Tai");
                    }
                    break;
                case 12:
                    if (day < 22) {
                        zodiac = "Nhan Ma";
                    } else if (day <= 31) {
                        zodiac = "Ma Ket";
                    } else {
                        System.out.println("Ngay Nay Khong Ton Tai");
                    }
                    break;
                default:
                    System.out.println("Khong Hop Le");
                    break;
            }
            if (!zodiac.isEmpty()){
                System.out.println("Cung Hoang Dao Cua Ban La "+zodiac);
            }
        }
    }
}

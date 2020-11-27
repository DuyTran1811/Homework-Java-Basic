package BaiTap4SwichCase;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var day = Integer.parseInt(input.nextLine());
        var month = Integer.parseInt(input.nextLine());
        var zodiac = "";
        switch (month) {
            case 1:
                if (day < 20) {
                    zodiac = "Ma Ket";
                } else if (day <= 31) {
                    zodiac = "Bao Binh";
                } else {
                    System.out.println("Ngay Khong Hop Le");
                }
                break;
            case 2:
                if (day < 19) {
                    zodiac = "Bao Binh";
                } else if (day <= 29) {
                    zodiac = "Song Ngu";
                } else {
                    System.out.println("Ngay Khong Hop Le");
                }
                break;
            case 3:
                if (day < 21) {
                    zodiac = "Song Ngu";
                } else if (day <= 31) {
                    zodiac = "Bach Duong";
                } else {
                    System.out.println("Ngay Khong Hop le");
                }
                break;
            case 4:
                if (day < 21) {
                    zodiac = "Bac Duong";
                } else if (day <= 30){
                    zodiac ="Kim Nguu";
                }else {
                    System.out.println("Ngay Khong Hop Le");
                }
                break;
            case 5:
                if (day<21){
                    zodiac = "Kim Nguu";
                }else if (day<=31){
                    zodiac = "Song Tu";
                }else {
                    System.out.println("Ngay Khong Hop Le");
                }
                break;
            case 6:
                if (day<22){
                    zodiac ="Song Tu";
                }else if (day<=30){
                    zodiac = "Cu Gia";
                }else {
                    System.out.println("Ngay Khong Hop Le");
                }
                break;
        }
    }
}

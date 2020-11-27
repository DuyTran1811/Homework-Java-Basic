package BaiTap4SwichCase;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Vao So");
        var number = Integer.parseInt(input.nextLine());
        var zodiac = "";
        switch (number) {
            case 1:
                zodiac = " Ty ";
                break;
            case 2:
                zodiac = " Su ";
                break;
            case 3:
                zodiac = " Dan ";
                break;
            case 4:
                zodiac = " Mao ";
                break;
            case 5:
                zodiac = " Thin ";
                break;
            case 6:
                zodiac = " Tỵ ";
                break;
            case 7:
                zodiac = " Ngo ";
                break;
            case 8:
                zodiac = " Mui ";
                break;
            case 9:
                zodiac = " Than ";
                break;
            case 10:
                zodiac = " Dau ";
                break;
            case 11:
                zodiac = " Tuat ";
                break;
            case 12:
                zodiac = " Hoi ";
                break;
            default:
                System.out.println("Gia Tri Khong Hop Le");
        }
        if (!zodiac.isEmpty()) {
            System.out.println(" So " + number + " Con Giap " + zodiac);
        }
    }
}

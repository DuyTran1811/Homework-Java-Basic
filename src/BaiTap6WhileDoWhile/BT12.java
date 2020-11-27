package BaiTap6WhileDoWhile;

import java.util.Scanner;

public class BT12 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int choice;
        var zodiac = "";
        do {
            System.out.println("Nhap Tu 1-12 de Xem Con Giap\nNhap 0 De Thoat");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    System.out.println("--End--");
                    break;
                case 1:
                    zodiac = "Ty";
                    break;
                case 2:
                    zodiac = "Su";
                    break;
                case 3:
                    zodiac = "Dan";
                    break;
                case 4:
                    zodiac = "Mao";
                    break;
                case 5:
                    zodiac = "Thin";
                    break;
                case 6:
                    zodiac = "Tỵ";
                    break;
                case 7:
                    zodiac = "Ngo";
                    break;
                case 8:
                    zodiac = "Mui";
                    break;
                case 9:
                    zodiac = "Than";
                    break;
                case 10:
                    zodiac = "Giau";
                    break;
                case 11:
                    zodiac = "Tuat";
                    break;
                case 12:
                    zodiac = "Hoi";
                    break;
                default:
                    System.out.println("Khong Co Con Giap Ban Chon");
            }
            if (!zodiac.isEmpty()) {
                System.out.println("STT " + choice + "  La Con Giap " + zodiac);
            }
        } while (choice != 0);
    }
}

package BaiTap6WhileDoWhile;

import java.util.Scanner;

public class BT14 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var choice = 0;
        while (true) {
            System.out.println("================");
            System.out.println("Nhan Phim 0 De Thoat: Nhan Phim Bat Ky De Tiep Tuc");
            choice = input.nextInt();
            // đọc bỏ dòng chứa kí tự thừa:
            input.nextLine();
            if (choice == 0) {
                System.out.println("Ket Thuc");
                break;
            }
            System.out.println("Nhap Ten Ngay Cua Thuan");
            var dayOfWeek = input.nextLine();
            var str = "";
            dayOfWeek = dayOfWeek.toLowerCase().trim();
            switch (dayOfWeek) {
                case "thu hai":
                    str = "Monday";
                    break;
                case "thu ba":
                    str = "Tuesday";
                    break;
                case "thu tu":
                    str = "Wednesday";
                    break;
                case "thu nam":
                    str = "Thursday";
                    break;
                case "thu sau":
                    str = "Friday";
                    break;
                case "thu bay":
                    str = "Saturday";
                    break;
                case "chu nhat":
                    str = "Sunday";
                    break;
                default:
                    str = "Invalid day of week";
                    break;
            }
            System.out.println("Ket Qua Chuyen Doi");
            System.out.println(dayOfWeek + " => " + str);
        }
    }
}

package BaiTap4SwichCase;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap So");
        var dayOfWeek = input.nextLine();
        dayOfWeek = dayOfWeek.toLowerCase();
        dayOfWeek = dayOfWeek.trim();
        var result = "";
        switch (dayOfWeek) {
            case "thứ hai":
                result = "Monday";
                break;
            case "thứ ba":
                result = "Tuesday";
                break;
            case "thứ tư":
                result = "Wednesday";
                break;
            case "thứ năm":
                result = "Thursday";
                break;
            case "thứ sáu":
                result = "Friday";
                break;
            case "thứ bảy":
                result = "Saturday";
                break;
            case "chủ nhật":
                result = "Sunday";
                break;
            default:
                result = "Invalid day of week";
                break;
        }
        System.out.println("Ket Qua Chuyen Doi");
        System.out.println(dayOfWeek + " ==> " + result);
    }
}

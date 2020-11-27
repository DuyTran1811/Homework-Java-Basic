package BT14SapSep;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Phan Tu Cua Mang");
        var n = input.nextInt();
        var number = getNumber(n, input);
        System.out.println("Mang Ban Dau");
        showArray(number);
        System.out.println("Mang Sau Khi Loc");
        fiter(number);
    }

    private static void fiter(int[] number) {
        for (int i = 0; i < number.length; i++) {
            if (!isExist(number, number[i], i)) {
                System.out.print(number[i] + " ");
            }
        }
    }

    /**
     *  phương thức kiểm tra xem n xuất hiện trong mảng trước đó chưa
     * @param number mảng gốc
     * @param n      giá trị cần kiểm tra
     * @param bound  biên cần xét
     * @return  true nếu n đã xuất hiện, false trong trường hợp ngược lại
     */
    private static boolean isExist(int[] number, int n, int bound) {
        for (int i = 0; i < bound; i++) {
            if (number[i] == n) {
                return true;
            }
        }
        return false;
    }

    /**
     *  Phuong Thuc Hien Thi Mang
     * @param number Mang Chua Cac Phan Tu Cua Mang
     */
    private static void showArray(int[] number) {
        for (var n : number) {
            System.out.print(n + " ");
        }
    }

    private static int[] getNumber(int n, Scanner input) {
        var number = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan Tu Thu" + (i + 1) + ": ");
            number[i] = input.nextInt();
        }
        return number;
    }
}

package BaiTap13Foreach;

import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Luong Nhan Vien");
        var n = input.nextInt();
        var words = getWords(n, input);
        show(words);
    }

    /**
     *  phương thức tính toán và hiển thị thông tin về lương bổng nhân viên
     * @param words  mảng danh sách ngày công nhân viên
     */
    private static void show(float[] words) {
        System.out.println("Thong Tin Tung Nhan Vien");
        System.out.printf("%-5s%-10s%-15s%-10s%-10s%-12s\n",
                "STT", "So Cong", "Luong Cung", "Phu Cap", "Bonus", "Tong Luong");
        for (int i = 0; i < words.length; i++) {
            var standard = 330 * words[i];
            var subsidize = 33 * (int) words[i];
            var bonusDay = (words[i] - 25 >= 0) ? (words[i] - 24) : 0;
            var bonus = bonusDay * 50;
            var total = standard + subsidize + bonus;
            System.out.printf("%-5d%-10.2f%-15.2f%-10d%-10.2f%-12.2f\n",
                    i + 1, words[i], standard, subsidize, bonus, total);
        }
    }

    private static float[] getWords(int n, Scanner input) {
        var words = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan Tu Thu: " + (i + 1) + ": ");
            words[i] = input.nextFloat();
            if (words[i] < 0 || words[i] > 30) {
                System.out.println("Nhap Ngay Cong Khong Qua 30");
                i--;
            }
        }
        return words;
    }
}

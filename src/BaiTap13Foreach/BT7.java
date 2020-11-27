package BaiTap13Foreach;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Phan Tu Cua Mang");
        var elements = input.nextInt();
        var TestMarks = getGrades(elements, input);
        showResult(TestMarks);
    }

    private static void showResult(float[] testMarks) {
        System.out.println("Thuoc Loai Sinh Vien");
        for (int i = 0; i < testMarks.length; i++) {
            System.out.println("STT " + i + ": " + testMarks[i] + " -> " + classify(testMarks[i]));
        }
    }

    private static String classify(float testMark) {
        if (testMark < 2.0f) {
            return "Truot";
        } else if (testMark < 2.5f) {
            return "Yeu";
        } else if (testMark < 3.0f) {
            return "Trung Binh";
        } else if (testMark < 3.2f) {
            return "Kha";
        } else if (testMark < 3.6f) {
            return "Gioi";
        } else {
            return "Xuat Sac";
        }
    }

    private static float[] getGrades(int elements, Scanner input) {
        var numbers = new float[elements];
        for (int i = 0; i < elements; i++) {
            System.out.println("Nhap Phan Tu Thu " + (i + 1) + ": ");
            numbers[i] = input.nextFloat();
        }
        return numbers;
    }
}

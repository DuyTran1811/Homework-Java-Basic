package BaiTap13Foreach;

import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Phan Tu Cua Mang : ");
        var n = input.nextInt();
        if (n > 0) {
            var grades = getGrades(n, input);
            var avgGrades = averageGrades(grades);
            System.out.printf("Diem Trung Binh Ca Lop La: %2.2f",avgGrades);
        }else {
            System.out.println("Nhap So Phan Tu Mang > 0");
        }
    }

    /**
     *   phương thức tính điểm trung bình của cả lớp
     * @param grades danh sách điểm tb từng sinh viên
     * @return điểm trung bình cả lớp
     */
    private static float averageGrades(float[] grades) {
        float total = 0;
        for (var grad : grades) {
            total += grad;
        }
        return total / grades.length;
    }

    private static float[] getGrades(int n, Scanner input) {
        var grade = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Element :" + (i + 1) + ": ");
            grade[i] = input.nextFloat();
            if (grade[i] < 0 || grade[i] > 10) {
                System.out.println("Nhap Diem Trong Doan [0-10]");
                i--;
            }
        }
        return grade;
    }
}

package BT17;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Mon Hoc: ");
        var n = input.nextInt();
        input.nextLine();
        if (n > 0) {
            Subject[] array = new Subject[n];
            fillSubjectsInfo(array, input);
            showSupbject(array);
        }
    }

    private static void fillSubjectsInfo(Subject[] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            Subject sub = new Subject();
            System.out.println("Nhap Thong Tin Mon Hoc Thu " + (i + 1) + ": ");
            System.out.print("Nhap Ma Mon Hoc\n");
            sub.setSubjectCode(input.nextLine());
            System.out.print("Nhap Ten Mon Hoc");
            sub.setNameSubject(input.nextLine());
            System.out.print("Nhap So Tin Chi");
            sub.setCredit(input.nextInt());
            System.out.print("Nhap So Tiet Hoc");
            sub.setNumberLessons(input.nextInt());
            System.out.print("Nhap So Bai Kiem Tra");
            sub.setTestNumber(input.nextInt());
            input.nextLine();
            array[i] = sub;
        }
    }

    private static void showSupbject(Subject[] array) {
        System.out.println("================================" + " THÔNG TIN MÔN HỌC ===============================");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n","Ma Mon Hoc","Ten Mon Hoc","So Tin Chi","So Tiet","So Bai Kiem Tra");
        for (var ar : array) {
            ar.showInformation();
        }
    }
}

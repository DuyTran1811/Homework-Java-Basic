package BT14SapSep;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Nhap So Phan Tu Cua Mang ");
        var n = scan.nextInt();
        var std = getStudents(n, scan);
        showName(std);
    }

    private static void showName(String[] std) {
        System.out.printf("%-15s%-10s\n", "Ten", "Xuat Hien");
        var isExit = false;
        for (int i = 0; i < std.length; i++) {
            for (int j = 0; j < i; j++) {
                if (std[j].toLowerCase().compareTo(std[i].toLowerCase()) == 0) {
                    isExit = true;
                    break;
                }
            }
            if (!isExit) {
                var count = numOfExist(std, std[i]);
                System.out.printf("%-15s: %-10d\n", std[i], count);
            }
        }
    }

    private static int numOfExist(String[] std, String s) {
        var count = 0;
        for (var c : std) {
            if (s.toLowerCase().compareTo(c.toLowerCase()) == 0) {
                count++;
            }
        }
        return count;
    }


    private static String[] getStudents(int n, Scanner scan) {
        var student = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan Tu Thu " + (i + 1) + ": ");
            student[i] = scan.next();
        }
        return student;
    }
}

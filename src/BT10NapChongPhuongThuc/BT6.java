package BT10NapChongPhuongThuc;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var choices = 0;
        do {
            System.out.println("1: Ve Hinh");
            System.out.println("2: Ve Hinh");
            System.out.println("3: Ve Hinh");
            System.out.println("0: De Thoat");
            switch (choices) {
                case 1:
                    drawRectangle();
                    break;
                case 2:
                    System.out.println("Nhap Vao 1 So");
                    var a = input.nextInt();
                    drawRectangle(a);
                    break;
                case 3:
                    System.out.println("Nhap Width ");
                    var width = input.nextInt();
                    System.out.println("Nhap Height");
                    var height = input.nextInt();
                    drawRectangle(width, height);
                    break;
            }
            choices = input.nextInt();
        } while (choices != 0);
    }

    private static void drawRectangle() {
        var size = 5;
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    private static void drawRectangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    private static void drawRectangle(int width, int height) {
        for (int i = 1; i <= width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

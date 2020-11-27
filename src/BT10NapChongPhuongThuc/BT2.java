package BT10NapChongPhuongThuc;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var choice = 0;
        do {
            System.out.println("1: TBC Int ");
            System.out.println("2: TBC Long");
            System.out.println("3: TBC Float");
            System.out.println("4: TBC Double");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap A");
                    var a = Integer.parseInt(input.nextLine());
                    System.out.println("Nhap B");
                    var b = Integer.parseInt(input.nextLine());
                    System.out.println("TBC INT " + add(a, b));
                    System.out.println("===================");
                    break;
                case 2:
                    System.out.println("Nhap A");
                    var a1 = input.nextLong();
                    System.out.println("Nhap B");
                    var b1 = input.nextLong();
                    System.out.println("TBC Long" + add(a1, b1));
                    System.out.println("==============");
                    break;
                case 3:
                    System.out.println("Nhap A");
                    var a2 = input.nextFloat();
                    System.out.println("Nhap B");
                    var b2 = input.nextFloat();
                    System.out.println("TBC Float " + add(a2, b2));
                    System.out.println("=============");
                    break;
                case 4:
                    System.out.println("Nhap A");
                    var a3 = input.nextDouble();
                    System.out.println("Nhap B");
                    var b3 = input.nextDouble();
                    System.out.println("TBC " + add(a3, b3));
                    System.out.println("============");
                    break;
            }
        } while (choice != 0);
    }

    public static double add(int a, int b) {
        return 0.5 * (a + b);
    }

    public static double add(long a, long b) {
        return 0.5 * (a + b);
    }

    public static double add(float a, float b) {
        return (a + b) / 2;
    }

    public static double add(double a, double b) {
        return (a + b) / 2;
    }
}

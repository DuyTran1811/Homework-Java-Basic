package BaiTap13Foreach;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap So Phan Tu Cua Mang");
        var num = input.nextInt();
        var numbers = getNumber(num, input);
        showNumber(numbers);
    }

    private static void showNumber(int[] numbers) {
        System.out.println("Phan Tich Tung So Thanh Thua So Nguyen To: ");
        for (int number : numbers) {
            System.out.println(splitToPrime(number));
        }
    }

    private static int[] getNumber(int num, Scanner input) {
        var number = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Nhap Phan Tu Thu " + (i + 1) + ": ");
            number[i] = input.nextInt();
        }
        return number;
    }

    /**
     * phương thức tách số n thành thừa số nguyên tố của nó
     *
     * @param number number là giá trị cần tách
     * @return giá trị chuỗi kết quả sau phân tách
     */
    private static String splitToPrime(int number) {
        String res = number + " = ";
        int i = 2;
        while (number > 1) {
            if (number % i == 0) {
                res += i;
                if (number != i) {
                    res += " * ";
                }
                number /= i;
            } else {
                i++;
            }
        }
        return res;
    }
}

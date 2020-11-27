package BaiTap3CauTrucifelse;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap number");
        var number = Integer.parseInt(input.nextLine());
        if (number % 2 == 0){
            System.out.println("La So Chan");
        }else {
            System.out.println("La So le");
        }
    }
}

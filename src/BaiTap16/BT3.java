package BaiTap16;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        BankAccount Account = new BankAccount();
        System.out.println("Nhap So Tai Khoan Cua Ban ");
        Account.accountNumber = input.nextLine();
        System.out.println("Nhap Ten Tai Khoan ");
        Account.bankName = input.nextLine();
        System.out.println("Nhap So Tien Gui va Tai Khoan");
        Account.deposit(input.nextLong());
        System.out.println("Nhap So Tien Muon Rut");
        var amount = input.nextLong();
        if (Account.withdrawal(amount)){
            System.out.println("Rut tien thanh cong");
            Account.checkAccountSurplus();
        }else {
            System.out.println("Rut tien khong thanh cong");
        }
    }
}

package BT34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        List<BankAccount> lisAccount = new ArrayList<>();
        var input = new Scanner(System.in);
        var choice = 0;
        do {
            System.out.println("/=/=/=/=/=/=/=/= MENUS LIST=/=/=/=/=/=/=/=");
            System.out.println("1 : Add Bank Account");
            System.out.println("2 : Display Bank Account");
            System.out.println("3 : Transfer Money To Accounts");
            System.out.println("4 : Account Withdrawal");
            System.out.println("5 : Transfer Account A => Account B");
            System.out.println("6 : Search Account Name");
            System.out.println("7 : Search Account ID");
            System.out.println("8 : Search Account Surplus >= X");
            System.out.println("9 : Delete Account");
            System.out.println("0 : Exit Program");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Thank you for using the service");
                    break;
                case 1:
                    var addAccount = creatBankAccount(input);
                    lisAccount.add(addAccount);
                    break;
                case 2:
                    showAccount(lisAccount);
                    break;
                case 3:
                    if (lisAccount.size() > 0) {
                        System.out.println("Enter ID Account Want Transfer");
                        var id = input.nextLine();
                        System.out.println("Enter Money Want Transfer");
                        var amount = input.nextLong();
                        var istransfer = transfer(lisAccount, id, amount);
                        if (istransfer) {
                            System.out.println("Successfully Transferred");
                        } else {
                            System.out.println("Transfer Failed");
                        }
                    } else {
                        System.out.println("The list is empty");
                    }
                    break;
                case 4:
                    if (lisAccount.size() > 0) {
                        System.out.println("Enter ID Nmber");
                        var id = input.nextLine();
                        System.out.println("Enter The Amount You Withdraw");
                        var amount = input.nextLong();
                        var withdrawal = Withdrawal(lisAccount, id, amount);
                        if (withdrawal) {
                            System.out.println("Successfully Withdraw");
                        } else {
                            System.out.println("Withdraw Failed");
                        }
                    } else {
                        System.out.println("The list is empty");
                    }
                    break;
                case 5:
                    if (lisAccount.size() > 0) {
                        System.out.println("Enter Account => A");
                        var aca = input.nextLine();
                        System.out.println("Enter Account => B");
                        var acb = input.nextLine();
                        System.out.println("Enter Money");
                        var amount = input.nextLong();
                        var transfersab = bankTransfers(lisAccount, aca, acb, amount);
                        if (transfersab) {
                            System.out.println("Money Transfer Successful");
                        } else {
                            System.out.println("Transfer Filed");
                        }
                    } else {
                        System.out.println("The list is empty");
                    }
                    break;
                case 6:
                    if (lisAccount.size() > 0) {
                        System.out.println("Enter Account Name");
                        var name = input.nextLine();
                        var result = searAccountName(lisAccount, name);
                        if (result.size() > 0) {
                            System.out.println("Find " + result.size() + " Result");
                            showAccount(result);
                        } else {
                            System.out.println("Name not found " + name);
                        }
                    } else {
                        System.out.println("The list is empty");
                    }
                    break;
                case 7:
                    if (lisAccount.size() > 0) {
                        System.out.println("Enter ID");
                        var id = input.nextLine();
                        var result = searById(lisAccount, id);
                        if (result != null) {
                            System.out.println("Find " + id);
                            show(result);
                        } else {
                            System.out.println("Not Found");
                        }
                    } else {
                        System.out.println("The list is empty");
                    }
                    break;
                case 8:
                    if (lisAccount.size() > 0) {
                        System.out.println("Enter Surplus");
                        var surplus = input.nextLong();
                        var result = searSurplus(lisAccount, surplus);
                        if (result.size() > 0) {
                            System.out.println("find " + result.size());
                            showAccount(result);
                        } else {
                            System.out.println("Not Found");
                        }
                    } else {
                        System.out.println("The list is empty");
                    }
                    break;
                case 9:
                    if (lisAccount.size() > 0) {
                        System.out.println("Enter ID");
                        var id = input.nextLine();
                        var result = removeAccount(lisAccount, id);
                        if (result) {
                            System.out.println(" Account Deleted Successfully");
                        } else {
                            System.out.println("Delete Account Not Found");
                        }
                    } else {
                        System.out.println("The list id empty");
                    }
                    break;
                default:
                    System.out.println("Please Choose Again");
                    break;
            }
        } while (choice != 0);
    }

    private static boolean removeAccount(List<BankAccount> lisAccount, String id) {
        for (int i = 0; i < lisAccount.size(); i++) {
            if (lisAccount.get(i).getId().equals(id)) {
                lisAccount.remove(i);
                return true;
            }
        }
        return false;
    }

    private static List<BankAccount> searSurplus
            (List<BankAccount> lisAccount, long surplus) {
        ArrayList<BankAccount> acnew = new ArrayList<>();
        for (var ac : lisAccount) {
            if (ac.getSurplus() >= surplus) {
                acnew.add(ac);
            }
        }
        return acnew;
    }


    // Phuong thuc chuyen tien tai khoan a sang tai khoan b
    private static boolean bankTransfers
    (List<BankAccount> lisAccount, String aca, String acb, long amount) {
        var acA = searById(lisAccount, aca);
        var acB = searById(lisAccount, acb);
        if (acA != null && acB != null) {
            return acA.banktransfer(acB, amount);
        }
        return false;
    }

    // phuong thuc rut tien
    private static boolean Withdrawal
    (List<BankAccount> lisAccount, String id, long amount) {
        for (BankAccount bankAccount : lisAccount) {
            if (bankAccount.getId().equals(id)) {
                return bankAccount.Withdrawal(amount);
            }
        }
        return false;
    }

    // phuong thuc chuyen tien
    private static boolean transfer
    (List<BankAccount> lisAccount, String id, long amount) {
        var ac = searById(lisAccount, id);
        if (ac != null) {
            return ac.transfer(amount);
        }
        return false;
    }

    // Phuong Thuc Tim kiem theo ma tai khoan
    private static BankAccount searById(List<BankAccount> lisAccount, String id) {
        for (BankAccount bankAccount : lisAccount) {
            if (bankAccount.getId().equals(id)) {
                return bankAccount;
            }
        }
        return null;
    }

    // tim kiem theo ten tai khoan
    private static List<BankAccount> searAccountName
    (List<BankAccount> lisAccount, String name) {
        ArrayList<BankAccount> newLis = new ArrayList<>();
        for (var ac : lisAccount) {
            if (ac.getOwnerName().toLowerCase().matches("*" + name + "*")) {
                newLis.add(ac);
            }
        }
        return newLis;
    }

    private static void showAccount(List<BankAccount> lisAccount) {
        if (lisAccount.size() > 0) {
            System.out.print("List Account Name\n");
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                    "ID Account", "AC.Number", "Owner", "Type.AC",
                    "Surplus", "Bank Name", "Start Date", "End Date");
            for (var ac : lisAccount) {
                show(ac);
            }
        }
    }

    private static void show(BankAccount ac) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                ac.getId(), ac.getAccountNumber(), ac.getOwnerName(), ac.getTypeAccount(), ac.getSurplus(),
                ac.getBankName(), ac.getStartDate(), ac.getEndDate());
    }


    /**
     * Phương thức nhập thông tin tài khoản
     *
     * @param input Lớp nhập dữ liệu
     * @return Trả về một đối tượng Tài khoản
     */
    private static BankAccount creatBankAccount(Scanner input) {
        System.out.println("Enter ID Account");
        var id = input.nextLine();
        System.out.println("Enter Number Account");
        var numberAccount = input.nextLine();
        System.out.println("Enter Owner Account");
        var owner = input.nextLine();
        System.out.println("Enter Type Account");
        var type = input.nextLine();
        System.out.println("Enter Surplus Account");
        var surplus = input.nextLong();
        input.nextLine();
        System.out.println("Enter Bank Name");
        var bankname = input.nextLine();
        System.out.println("Enter Start Date");
        var startdate = input.nextLine();
        System.out.println("Enter End Date");
        var enddate = input.nextLine();
        return new BankAccount(id, numberAccount, owner, type, surplus, bankname, startdate, enddate);
    }
}

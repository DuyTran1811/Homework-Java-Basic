package BT34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        List<Employee34> emp = new ArrayList<>();
        var input = new Scanner(System.in);
        var choice = 0;
        do {
            System.out.println("/=/=/=/=/=/=/=/=/Menus/=/=/=/=/=/=/=");
            System.out.println("1: Add Employee");
            System.out.println("2: Display Employee Information");
            System.out.println("3: Search Name Employee ");
            System.out.println("4: Delete Employee ");
            System.out.println("5: Exit Program");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    var add = creatNewEmployee(input);
                    emp.add(add);
                    System.out.println("Ok Done");
                    break;
                case 2:
                    showEmployee(emp);
                    break;
                case 3:
                    if (emp.size() > 0) {
                        var id = "";
                        System.out.println("Enter Code Employee");
                        id = input.nextLine().trim();
                        var result = searchEmployee(emp, id);
                        if (emp.size() > 0) {
                            System.out.println("Find " + result.size() + " Result");
                            showEmployee(result);
                        } else {
                            System.out.println("The Lis of employee empty");
                        }
                    }
                    break;
                case 4:
                    if (emp.size() > 0) {
                        System.out.println("Enter Code Employee");
                        var id = input.nextLine();
                        var results = deleteEmployee(emp, id);
                        if (results) {
                            System.out.println("Done");
                        } else {
                            System.out.println(" Id incorrect");
                        }
                    }
                    break;
                case 5:
                    break;
            }
        }
        while (choice != 0);
    }

    /**
     *           Phương Thức Xoá Nhân Viên
     * @param emp List Nhân Viên
     * @param id  Id Nhân Viên
     * @return    Trả Về Nhân Viên
     */
    private static boolean deleteEmployee(List<Employee34> emp, String id) {
        for (int i = 0; i < emp.size(); i++) {
            if (emp.get(i).getId().equals(id)) {
                emp.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     *             Phương Thức Tìm Kiếm Nhân Viên Bằng ID
     * @param emp  List Nhân Viên
     * @param id   Mã Nhân Viên
     * @return     Trả Về List Nhân Viên
     */
    private static List<Employee34> searchEmployee(List<Employee34> emp, String id) {
        List<Employee34> list = new ArrayList<>();
        for (var ep : emp) {
            if (ep.getId().equals(id)) {
                list.add(ep);
            }
        }
        return list;
    }

    /**
     * Phương Thức Têm Nhân Viên
     *
     * @param input Nhập Các Thông Số Của Đối Tượng
     * @return Trả Về 1 Đối Tượng Nhân Viên
     */
    private static Employee34 creatNewEmployee(Scanner input) {
        System.out.println("Enter Code Employee");
        var id = input.nextLine();
        System.out.println("Enter Name");
        var name = input.nextLine();
        System.out.println("Enter Age");
        var age = input.nextInt();
        input.nextLine();
        System.out.println("Enter Address");
        var address = input.nextLine();
        System.out.println("Enter PhoneNumber");
        var phone = input.nextLine();
        System.out.println("Enter Salary");
        var salary = input.nextFloat();
        System.out.println("Enter Experience");
        var experience = input.nextFloat();
        return new Employee34(id, name, age, address, phone, salary, experience);
    }

    /**
     * Phương Thức Hiển Thị Tên Nhân Viên
     *
     * @param emp List Nhân Viên
     */
    private static void showEmployee(List<Employee34> emp) {
        if (emp.size() > 0) {
            System.out.print("Danh Sach Nhan Vien\n");
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                    " Employee Code ", " Name ", " Age ", " Address ", " PhoneNumber ", "Salary", " Experience ");
            for (var e : emp) {
                show(e);
            }
        }
    }

    private static void show(Employee34 e) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                e.getId(), e.getName(), e.getAge(), e.getAddress(), e.getPhoneNumber(), e.getSalary(), e.getExperience());
    }
}

package BaiTap16;

public class Employee {
    public String id;              //  Mã nhân viên
    public String name;            //  Họ tên nhân viên
    public String address;         //  Địa chỉ nhân viên
    public int age;                //  Tuổi
    public String phoneNumber;     //  Số điện thoại
    public float salary;           //  Lương nhân viên
    public float experience;       //  Số năm kinh ngiệm

    public void work(String jop) {
        System.out.println(name + " Dang Lam Viec " + jop);
    }

    public void relax() {
        System.out.println(name + " Dang Ngi Ngoi ");
    }

    public void receiveSalary(float amount) {
        salary = amount;
        System.out.println(name + " Luong Thang La " + salary + " VND ");
    }

    public void travel(String someWhere) {
        System.out.println(name + " Dang Di Choi O " + someWhere);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}

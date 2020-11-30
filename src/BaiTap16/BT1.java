package BaiTap16;

public class BT1 {
    public static void main(String[] args) {
        Employee nam = new Employee();
        nam.name = "Nguyen Hoai Nam";
        nam.address ="Ha Noi";
        nam.age = 25;
        nam.receiveSalary(30000);
        nam.work("Danh May");
        nam.relax();
        nam.travel("Chau Au");
    }
}

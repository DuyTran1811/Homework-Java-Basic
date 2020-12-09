package BT34;

public class Employee34 {
    private String id;                  // Ma Nhan Vien
    private String name;                // Ten Nhan Vien
    private int age;                    // Tuoi Nhan Vien
    private String address;             // Dia Chi Nhan Vien
    private String phoneNumber;         // So Dien Thoai Nhan Vien
    private float salary;               // Luong Nhan Vien
    private float experience;           // Kinh Ngiem Nhan Vien

    public Employee34() {
        id = "";
        name = "";
        age = 0;
        address = "";
        phoneNumber = "";
        salary = 0;
        experience = 0;
    }

    public Employee34(String id) {
        this.id = id;
    }

    public Employee34(String id, String name) {
        this(id);
        this.name = name;
    }

    public Employee34(String id, String name, int age) {
        this(id, name);
        this.age = age;
    }

    public Employee34(String id, String name, int age, String address) {
        this(id, name, age);
        this.address = address;
    }

    public Employee34(String id, String name,
                      int age, String address, String phoneNumber) {
        this(id, name, age, address);
        this.phoneNumber = phoneNumber;
    }

    public Employee34(String id, String name,
                      int age, String address,
                      String phoneNumber, float salary) {
        this(id, name, age, address, phoneNumber);
        this.salary = salary;
    }

    public Employee34(String id, String name,
                      int age, String address,
                      String phoneNumber, float salary, float experience) {
        this(id, name, age, address, phoneNumber, salary);
        this.experience = experience;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
}

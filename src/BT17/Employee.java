package BT17;

public class Employee {
    private String id;
    private String name;
    private String address;
    private int age;
    private String phoneNumber;
    private float salary;
    private float experience;

    public Employee() {
        id = "";
        name = "";
        address = "";
        age = 0;
        phoneNumber = "";
        salary = 0;
        experience = 0;
    }

    public Employee(String id) {
        this.id = id;
    }

    public Employee(String id, String name) {
        this(id);
        this.name = name;
    }

    public Employee(String id, String name, String address) {
        this(id, name);
        this.address = address;
    }

    public Employee(String id, String name, String address, int age) {
        this(id, name, address);
        this.age = age;
    }

    public Employee(String id, String name, String address, int age, String phoneNumber) {
        this(id, name, address, age);
        this.phoneNumber = phoneNumber;
    }

    public Employee(String id, String name,
                    String address, int age,
                    String phoneNumber, float salary) {
        this(id, name, address, age, phoneNumber);
        this.salary = salary;
    }

    public Employee(String id, String name,
                    String address, int age,
                    String phoneNumber,
                    float salary, float experience) {
        this(id, name, address, age, phoneNumber, salary);
        this.experience = experience;
    }

    public void worker(String jop) {
        System.out.println(name + " Dang Lam Viec " + jop);
    }

    public void salaryT(float amount) {
        salary = amount;
        System.out.println(name + " Luong Thang La" + salary + " VND ");
    }

    public void travel(String someWhere) {
        System.out.println(name + " Dang Du Lich Da Nang " + someWhere);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (!id.isEmpty()) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (checkName(name)) {
            this.name = name;
        } else {
            System.out.println("Ten Khong Hop Le");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    private boolean checkName(String name) {
        if (name.length() == 0) {
            return false;
        }
        if (name.matches(".*[^a-zA-Z\\s]+.*")) {
            return false;
        }
        return true;
    }
}


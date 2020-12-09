package BT34.BT3;

// mo ta doi tuong sinh vien
public class Student {
    private String id;
    private FullName fullName;
    private String address;
    private String email;
    private String gender;
    private String phoneNumber;
    private String className;
    private String specialized;

    public Student() {
        id = "";
        fullName = new FullName();
        address = "";
        email = "";
        gender = "";
        phoneNumber = "";
        className = "";
        specialized = "";
    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String fullName) {
        this(id);
        setFullName(fullName);
    }

    public Student(String id, String fullName, String address) {
        this(id, fullName);
        this.address = address;
    }

    public Student(String id, String fullName,
                   String address, String email) {
        this(id, fullName, address);
        this.email = email;
    }

    public Student(String id, String fullName,
                   String address, String email, String gender) {
        this(id, fullName, address, email);
        this.gender = gender;
    }

    public Student(String id, String fullName,
                   String address, String email,
                   String gender, String phoneNumber) {
        this(id, fullName, address, email, gender);
        this.phoneNumber = phoneNumber;
    }

    public Student(String id, String fullName,
                   String address, String email,
                   String gender, String phoneNumber,
                   String className) {
        this(id, fullName, address, email, gender, phoneNumber);
        this.className = className;
    }

    public Student(String id, String fullName,
                   String address, String email,
                   String gender, String phoneNumber,
                   String className, String specialized) {
        this(id, fullName, address, email, gender, phoneNumber, className);
        this.specialized = specialized;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName.last + " " + fullName.mid + " " + fullName.first;
    }

    public void setFullName(String fullName) {
        var words = fullName.split(" ");
        this.fullName.last = words[0];
        this.fullName.first = words[words.length - 1];
        this.fullName.mid = "";
        for (int i = 1; i < words.length - 1; i++) {
            this.fullName.mid += words[i];
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    class FullName {
        private String first;
        private String last;
        private String mid;
    }
}

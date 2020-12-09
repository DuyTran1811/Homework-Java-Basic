package BT34.BT3;
// Mo Ta thong tin mon hoc
public class Subject {
    private String id;               // Mã môn học
    private String name;             // Tên môn học
    private int credits;             // Số tín chỉ
    private int numberOfLessons;     // Số tiết học
    private int CheckOldest;         // Số bài kiểm tra

    public Subject() {
        id = "";
        name = "";
        credits = 0;
        numberOfLessons = 0;
        CheckOldest = 0;
    }

    public Subject(String id) {
        this.id = id;
    }

    public Subject(String id, String name) {
        this(id);
        this.name = name;
    }

    public Subject(String id, String name, int credits) {
        this(id, name);
        this.credits = credits;
    }

    public Subject(String id, String name,
                   int credits, int numberOfLessons) {
        this(id, name, credits);
        this.numberOfLessons = numberOfLessons;
    }

    public Subject(String id, String name, int credits,
                   int numberOfLessons, int checkOldest) {
        this(id, name, credits, numberOfLessons);
        CheckOldest = checkOldest;
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

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }

    public void setNumberOfLessons(int numberOfLessons) {
        this.numberOfLessons = numberOfLessons;
    }

    public int getCheckOldest() {
        return CheckOldest;
    }

    public void setCheckOldest(int checkOldest) {
        CheckOldest = checkOldest;
    }
}

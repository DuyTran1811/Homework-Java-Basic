package BT17;

public class Subject {
    private String subjectCode;
    private String nameSubject;
    private int credit;
    private int numberLessons;
    private int testNumber;

    public Subject() {
    }

    public Subject(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public Subject(String subjectCode, String nameSubject) {
        this(subjectCode);
        this.nameSubject = nameSubject;
    }

    public Subject(String subjectCode, String nameSubject, int credit) {
        this(subjectCode, nameSubject);
        this.credit = credit;
    }

    public Subject(String subjectCode, String nameSubject, int credit, int numberLessons) {
        this(subjectCode, nameSubject, credit);
        this.numberLessons = numberLessons;
    }

    public Subject(String subjectCode, String nameSubject, int credit, int numberLessons, int testNumber) {
        this(subjectCode, nameSubject, credit, numberLessons);
        this.testNumber = testNumber;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getNumberLessons() {
        return numberLessons;
    }

    public void setNumberLessons(int numberLessons) {
        this.numberLessons = numberLessons;
    }

    public int getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(int testNumber) {
        this.testNumber = testNumber;
    }

    @Override
    public String toString() {
        return "Subject { " +
                " Ma Mon Hoc = '" + subjectCode + '\'' +
                ", Ten Mon Hoc = '" + nameSubject + '\'' +
                ", So Tin Chi = " + credit +
                ", So Tiet Hoc = " + numberLessons +
                ", So Bai Kiem Tra = " + testNumber +
                '}';
    }
    public void showInformation(){
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n",
                subjectCode,nameSubject,credit,numberLessons,testNumber);
    }
}

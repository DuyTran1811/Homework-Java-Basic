package BT34.BT3;

import java.util.ArrayList;
import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var choice = 0;
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Subject> subjects = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        do {
            System.out.println("/=/=/=/=/=/=Menus=/=/=/=/=/=");
            System.out.println("1: Thêm 1 môn học vào danh sách môn học");
            System.out.println("2: Thêm mới 1 sinh viên vào danh sách sinh ");
            System.out.println("3: Thêm mới 1 lớp học vào 1 danh sách lớp học ");
            System.out.println("4: Thêm mới 1 sinh viên vào 1 lớp học nào đó ");
            System.out.println("5: Hien Thi Danh Sach Mon Hoc");
            System.out.println("6: Hien Thi Danh Sach Sinh Vien");
            System.out.println("7: Hien Thi Danh Sach Lop Theo Ma Lop");
            System.out.println("8: Nhap Diem Tinh Diem Trung Binh");
            System.out.println("9: Set Hoc Luc Sinh Vien Trong Lop");
            System.out.println("10: Tim Sinh Vien Co Trong Lop Khong");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Cam on ban da su dung dich vu");
                case 1:
                    var sb = creatSubject(input);
                    subjects.add(sb);
                    System.out.println("Them Thanh Cong");
                    break;
                case 2:
                    var std = creatStudent(input);
                    students.add(std);
                    System.out.println("Them Thanh Cong");
                    break;
                case 3:
                    if (subjects.size() > 0) {
                        var cs = creatCourse(input, subjects);
                        if (cs != null) {
                            courses.add(cs);
                            System.out.println("Them Thanh Cong");
                        }else {
                            System.out.println("Tao That Bai");
                        }
                    }else {
                        System.out.println("Danh Sach Trong");
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
            }
        } while (choice != 0);
    }

    private static Course creatCourse(Scanner input, ArrayList<Subject> subjects) {
        System.out.println("Ma Lop Hoc");
        var id = input.nextLine();
        System.out.println("Ten lop");
        var name = input.nextLine();
        System.out.println("Ten phong hoc");
        var className = input.nextLine();
        System.out.println("Gio Hoc");
        var time = input.nextLine();
        System.out.println("Ma Mon Hoc");
        var subjectid = input.nextLine();
        var subjec = findSubjectById(subjects, subjectid);
        if (subjec == null) {
            System.out.println("Ma hoc \"" + subjectid + "Khong ton tai");
            return null;
        } else {
            Course course = new Course();
            course.setId(id);
            course.setName(name);
            course.setClassRom(className);
            course.setTime(time);
            course.setSubject(subjec);
            return course;
        }
    }

    private static Subject findSubjectById(ArrayList<Subject> subjects, String subjectid) {
        for (var sub : subjects) {
            if (sub.getId().equals(subjectid)) {
                return sub;
            }
        }
        return null;
    }

    private static Student creatStudent(Scanner input) {
        System.out.println("Nhap ma sinh vien");
        var id = input.nextLine();
        System.out.println("Nhap ten sinh vien");
        var name = input.nextLine();
        System.out.println("Nhap dia chi");
        var address = input.nextLine();
        System.out.println("Nhap Email");
        var email = input.nextLine();
        System.out.println("Nhap gio tinh");
        var gender = input.nextLine();
        System.out.println("Nhap so dien thoai");
        var phone = input.nextLine();
        System.out.println("Nhap Ten Lop");
        var classname = input.nextLine();
        System.out.println("Nhap Khoa");
        var specialized = input.nextLine();
        return new Student(id, name, address, email, gender, phone, classname, specialized);
    }

    private static Subject creatSubject(Scanner input) {
        System.out.println("Nhap Ma Mon Hoc");
        var id = input.nextLine();
        System.out.println("Nhap Ten Mon Hoc");
        var name = input.nextLine();
        System.out.println("Nhap So Tin Chi");
        var credit = input.nextInt();
        System.out.println("Nhap Tiet Hoc");
        var numberOfLessons = input.nextInt();
        System.out.println("Nhap So Bai Kiem Tra");
        var checkOldest = input.nextInt();
        return new Subject(id, name, credit, numberOfLessons, checkOldest);
    }
}

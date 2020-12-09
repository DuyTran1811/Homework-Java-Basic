package BT34.BT3;

import java.util.ArrayList;

// mo ta thong tin ve khoa hoc
public class Course {
    private String id;                           // Ma lop
    private String name;                         // Ten lop
    private String classRom;                     // Phong hoc
    private String time;                         // Gio Hoc
    private Subject subject;                      // mon hoc
    private ArrayList<Transcript> transcripts;   // Danh sach bang diem

    public Course() {
        id = "";
        name = "";
        classRom = "";
        time = "";
        subject = null;
        transcripts = new ArrayList<>();
    }

    public Course(String id, String name, String classRom,
                  String time, Subject subject) {
        this();
        this.id = id;
        this.name = name;
        this.classRom = classRom;
        this.time = time;
        this.subject = subject;
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

    public String getClassRom() {
        return classRom;
    }

    public void setClassRom(String classRom) {
        this.classRom = classRom;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public ArrayList<Transcript> getTranscripts() {
        return transcripts;
    }

    /**
     * Phuong thuc cap nhat bang diem
     *
     * @param student    Sinh vien da co trong lop
     * @param transcript Bang diem cua sinh vien tuong ung
     */
    public void setTranscripts(Student student, Transcript transcript) {
        for (Transcript value : transcripts) {
            if (value.student.getId().compareTo(student.getId()) == 0) {
                value.transcript = transcript;
                break;
            }
        }
    }

    /**
     * Phuong thuc Them sinh vien vao 1 lop
     * @param student  Sinh vien can them vao lop hoc
     */
    public void addStudentToCourse(Student student) {
        transcripts.add(new Transcript(student,null));
    }

    public class Transcript {
        private Student student;
        private Transcript transcript;

        public Transcript() {
        }

        public Transcript(Student student, Transcript transcript) {
            this.student = student;
            this.transcript = transcript;
        }

        public Student getStudents() {
            return student;
        }

        public Transcript getTranscript() {
            return transcript;
        }
    }
}

package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BT13 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input13.txt");
        var input = new Scanner(file);
        var student = getStudent(input);
        contName(student);

    }

    private static void contName(ArrayList<String> student) {
        System.out.printf("%-15s%-15s\n", "Ten", "Xuat Hien");
        for (int i = 0; i < student.size(); i++) {
            var isExist = false;
            for (int j = 0; j < i; j++) {
                if (student.get(j).toLowerCase().compareTo(student.get(i).toLowerCase()) == 0) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                var count = numOfExist(student, student.get(i));
                System.out.printf("%-15s: %-10d\n", student.get(i), count);
            }
        }
    }

    private static int numOfExist(ArrayList<String> student, String key) {
        var count = 0;
        for (var s : student) {
            if (key.toLowerCase().compareTo(s.toLowerCase()) == 0) {
                count++;
            }
        }
        return count;
    }


    private static ArrayList<String> getStudent(Scanner input) {
        var student = new ArrayList<String>();
        while (input.hasNext()) {
            student.add(input.next());
        }
        return student;
    }
}

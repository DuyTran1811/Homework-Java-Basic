package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input6.txt");
        var input = new Scanner(file);
        while (input.hasNextLine()) {
            var str = input.nextLine();
            var words = str.split("\\s+");
            System.out.println(" Day ban Dau");
            show(words);
            System.out.println("Sau Khi Sap Xep");
            sortStr(words);
            show(words);
        }
        input.close();
    }

    private static void show(String[] words) {
        for (var str : words) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    private static void sortStr(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = words.length - 1; j > i; j--) {
                if (words[i].compareTo(words[j - 1]) < 0) {
                    var tmp = words[j];
                    words[j] = words[j - 1];
                    words[j - 1] = tmp;
                }
            }
        }
    }

}

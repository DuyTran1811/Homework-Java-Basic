package BT36DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/turtle/Documents/Workspace/Java11/src/BT36DocFile/input7.txt");
        var input = new Scanner(file);
        while (input.hasNextLine()) {
            var str = input.nextLine();
            var word = str.split("\\s+");
            System.out.println("cac tu truoc sap xep");
            show(word);
            System.out.println("Cac tu sau khi sap xep");
            sort(word);
            show(word);
        }
        input.close();
    }

    private static void sort(String[] word) {
        for (int i = 0; i < word.length - 1; i++) {
            for (int j = word.length - 1; j > i; j--) {
                if (word[i].compareTo(word[j - 1]) > 0) {
                    var tmp = word[j];
                    word[j] = word[j - 1];
                    word[j - 1] = tmp;
                }
            }
        }
    }

    private static void show(String[] word) {
        for (var s : word) {
            System.out.print(s + " ");
        }
    }
}

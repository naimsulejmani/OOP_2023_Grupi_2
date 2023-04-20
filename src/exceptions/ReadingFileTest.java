package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFileTest {
    public static void main(String[] args) {
        String fileName = "src/exceptions/AddArgument.java";
        try {
            int lines = countLines(fileName);
            System.out.println("Total lines: " + lines);
        } catch (FileNotFoundException e) {
            System.out.println("Ndodhi nje gabim!");
            System.out.println(e.getMessage());
        }
    }

    public static int countLines(String fileName) throws FileNotFoundException {
        int counter = 0;
        Scanner scanner = null;

        scanner = new Scanner(new File(fileName));

        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            System.out.println(line);
            counter++;
        }

        return counter;
    }
}

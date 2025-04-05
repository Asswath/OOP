import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExample {
    public static void main(String[] args) {
        File file = new File("non_existent.txt");

        try {
            Scanner sc = new Scanner(file); // May throw FileNotFoundException
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
    }
}

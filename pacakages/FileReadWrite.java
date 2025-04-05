import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "sample.txt";

        try {
            FileWriter writer = new FileWriter(filename);
            System.out.print("Enter text to write in file: ");
            String input = sc.nextLine();
            writer.write(input);
            writer.close();

            System.out.println("File written successfully.");

            FileReader reader = new FileReader(filename);
            System.out.println("Reading from file:");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

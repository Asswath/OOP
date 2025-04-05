import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWrite1 {
    public static void main(String[] args) {
        String filename = "sample.txt";

        // Writing to file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is a test file.\nFile handling in Java is simple!");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Reading from file
        try (FileReader reader = new FileReader(filename)) {
            System.out.println("\nReading from file:");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

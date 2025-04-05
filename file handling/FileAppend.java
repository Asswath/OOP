import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {
    public static void main(String[] args) {
        String filename = "sample.txt";

        try (FileWriter writer = new FileWriter(filename, true)) { // 'true' enables append mode
            writer.write("\nAppending new line to the file.");
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending file: " + e.getMessage());
        }
    }
}

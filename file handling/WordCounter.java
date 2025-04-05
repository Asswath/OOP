import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) {
        String filename = "sample.txt";
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split by whitespace
                wordCount += words.length;
            }
            System.out.println("Total Words: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

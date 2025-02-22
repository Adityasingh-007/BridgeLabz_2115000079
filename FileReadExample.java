import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        String fileName = "info.txt";

        // Try-with-resources to auto-close BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String firstLine = br.readLine();
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
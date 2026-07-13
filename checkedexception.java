import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try (FileReader file = new FileReader("data.txt")) {
            System.out.println("File opened successfully.");
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

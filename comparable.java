import java.io.FileReader;
import java.io.IOException;

public class comparable {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            System.out.println("File opened successfully.");
            file.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
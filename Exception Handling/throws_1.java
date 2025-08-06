import java.io.IOException;

public class throws_1 {

    static void readFile() throws IOException {
        throw new IOException("File not found!");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Handled: " + e.getMessage());
        }
    }
}

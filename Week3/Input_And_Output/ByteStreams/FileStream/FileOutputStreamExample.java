import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String outputFile = "output.txt";
        String data = "Hello, World!";

        try (FileOutputStream fos = new FileOutputStream(outputFile)) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
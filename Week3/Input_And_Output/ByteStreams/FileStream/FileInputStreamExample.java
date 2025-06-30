import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample{
    public static void main(String[] args) {
        String inputFile = "input.txt";
        
        try (FileInputStream fis = new FileInputStream(inputFile)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.println((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
# this is equivalent to the following code:

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream(inputFile);
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
} 
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// try to compile this! It won't work - we have to handle the checked exception

public class CheckedVersusUncheckedExceptionExample {
    public static void main(String[] args){ 
        readFile("myFile.txt");
    }

    private static void readFile (String fileName) {
        try{
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found! " + e.getMessage());
        }


    }
}
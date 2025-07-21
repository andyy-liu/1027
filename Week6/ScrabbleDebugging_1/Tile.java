
import java.util.Random;

public class Tile {
    private char value;

    public Tile() {
        pickup();
    }

    public Tile(char value) {
        this.value = value;
    }

    private void pickup() {
        // create random object
        Random rand = new Random();
        // create a string containing all possible chars
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // pick one
        char selected = chars.charAt(rand.nextInt(chars.length()));
        // set to the value field
        this.value = selected;
    }

    public char getValue() {
        return value;
    }

}
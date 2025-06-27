import java.util.Random;

public class Tile {
    private char letter;

    public Tile() {
        letter = generateLetter(); // generate a random letter for the tile
    }

    public Tile(char c) {
        this.letter = c; // initialize the tile with a specific letter
    }

    private char generateLetter() {
        Random random = new Random();
        // the ASCII value of ‘A’ is 65 and ‘Z’ is 90
        return (char) (random.nextInt(26) + 'A');
    }

    public char getLetter() {
        return this.letter; // return the letter of the tile
    }
}
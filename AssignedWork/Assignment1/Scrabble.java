import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class Scrabble {
    private Tile tiles[];

    public Scrabble() {
        tiles = new Tile[7]; // initialize the tiles array with 7 Tile objects
        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = new Tile(); // create a new Tile with a random letter
        }
    }

    public Scrabble(Tile[] tiles) throws IllegalArgumentException {
        if (tiles.length != 7) {
            throw new IllegalArgumentException("Invalid number of tiles. Exactly 7 tiles are required."); // ensure
                                                                                                          // exactly 7
                                                                                                          // tiles are
                                                                                                          // provided
        }
        this.tiles = tiles; // initialize the tiles array with the provided Tile objects
    }

    public String getLetters() {
        StringBuilder letters = new StringBuilder(); // use StringBuilder for string concatenation
        for (Tile tile : tiles) { // : means "in" or "from" in this context, iterates through each tile in the
                                  // tiles array
            letters.append(tile.getLetter()); // append each tile's letter to the StringBuilder
        }
        return letters.toString(); // convert StringBuilder to a String and return it
    }

    public ArrayList<String> getWords() throws FileNotFoundException {
        ArrayList<String> spellableWords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("CollinsScrabbleWords2019.txt"))) {
            String word; // stores the word that we are currently looking at
            while ((word = br.readLine()) != null) { // loops through each individual word in the
                String myLetters = getLetters(); // get the letters from the Scrabble object. this is put here so that
                                                 // we can reset myLetters for each word
                for (int i = 0; i < word.length(); i++) {
                    char letter = word.charAt(i);
                    if (myLetters.indexOf(letter) != -1) { // checks if the letter exists in myLetters, -1 means not
                                                           // found
                        myLetters = myLetters.replaceFirst(String.valueOf(letter), ""); // replaceFirst removes the
                                                                                        // first occurrence of the
                                                                                        // letter
                    } else {
                        break; // exit the loop since we can't spell this word
                    }
                    if (myLetters.length() == 7 - word.length()) {
                        spellableWords.add(word); // add the word to the list of spellable words
                        break; // exit the loop since we found a valid word
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return spellableWords;
    }

    public int[] getScores() throws FileNotFoundException {
        ArrayList<String> spellableWords = this.getWords();
        int[] wordScores = new int[spellableWords.size()];
        for (int i = 0; i < spellableWords.size(); i++) {
            String word = spellableWords.get(i);
            int score = 0;
            for (char letter : word.toCharArray()) {
                score += getLetterValue(letter); // calculate the score for each letter in the word
            }
            wordScores[i] = score; // store the score for the current word
        }
        Arrays.sort(wordScores);
        return wordScores;
    }

    private int getLetterValue(char letter) {
        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'L' || letter == 'N' || letter == 'O'
                || letter == 'R' || letter == 'S' || letter == 'T' || letter == 'U') {
            return 1;
        } else if (letter == 'D' || letter == 'G') {
            return 2;
        } else if (letter == 'B' || letter == 'C' || letter == 'M' || letter == 'P') {
            return 3;
        } else if (letter == 'F' || letter == 'H' || letter == 'V' || letter == 'W' || letter == 'Y') {
            return 4;
        } else if (letter == 'K') {
            return 5;
        } else if (letter == 'J' || letter == 'X') {
            return 8;
        } else if (letter == 'Q' || letter == 'Z') {
            return 10;
        } else {
            throw new IllegalArgumentException("Invalid Scrabble letter: " + letter);
        }
    }

    public boolean equals(Scrabble s) {
        char[] thisCharArray = this.getLetters().toCharArray();
        char[] otherCharArray = s.getLetters().toCharArray();
        Arrays.sort(thisCharArray);
        Arrays.sort(otherCharArray);
        return Arrays.equals(thisCharArray, otherCharArray);
        // This method checks if two Scrabble objects have the same letters, regardless
        // of order
    }
}

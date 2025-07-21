
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Scrabble {
    private Tile[] tiles;

    public Scrabble() {
        // initialize array
        this.tiles = new Tile[7];
        // initialize seven tiles
        for (int i = 0; i < 7; i++) {
            Tile tile = new Tile();
            tiles[i] = tile;
        }
    }

    public Scrabble(Tile[] tiles) {
        this.tiles = tiles;
    }

    public String getLetters() {
        // create String variablke to hold letters
        String letters = "";
        // loop over tiles
        for (int i = 0; i < 7; i++) {
            letters += tiles[i];
        }

        return letters;
    }

    public ArrayList<String> getWords() {
        // create the list to store words
        ArrayList<String> words = new ArrayList<String>();
        try {
            // open the file 'CollinsScrabbleWords2019.txt'
            BufferedReader reader = new BufferedReader(new FileReader("CollinsScrabbleWords2019.txt"));
            String word;
            // read all words from file
            boolean valid;
            while ((word = reader.readLine()) != null) {
                /**
                 * If the letters from the word are in the tiles array and there are also
                 * enough count of each letter to form the word, then the word is valid
                 */
                // check that the letters are in the tiles
                valid = true;
                String myLetters = getLetters();
                for (int i = 0; i < word.length(); i++) {
                    String c = Character.toString(word.charAt(i));
                    //System.out.println(c);
                    //System.out.println(myLetters);
                    if (myLetters.indexOf(c) != -1) {
                        // System.out.println(c + " is in myLetters!");
                        myLetters = myLetters.replaceFirst(c, "");
                    }
                    else {
                        valid = false;
                    }
                }
                if (valid) {
                    words.add(word);
                }
            }

            // close reader
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return words;
    }

    public int[] getScores() {
        // get list of words
        ArrayList<String> words = getWords();
        // get the number of words
        int n = words.size();
        // initialize the array
        int[] scores = new int[n];

        // declare an array with the individual scores of each letter
        int[] letter_score = { 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10 };

        // create a string containing all possible chars. The characters are in the same
        // order as in the above array of individual scores
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // get the score for each word
        int score;
        String word;
        char ch;
        int index;
        for (int i = 0; i < n; i++) {
            // get word at index i
            word = words.get(i);
            score = 0;
            // get each character
            for (int j = 0; j < word.length(); j++) {
                ch = word.charAt(j);
                // get index of the character in the 'chars' string
                index = chars.indexOf(ch);
                score += letter_score[index];
            }

            // add to the scores array
            scores[i] = score;
        }

        // now, sort in ascending order
        Arrays.sort(scores);

        // return
        return scores;
    }

    public boolean equals(Object o) {

        // check that the other object is a Scrabble object
        if (!(o instanceof Scrabble)) {
            return false;
        }

        Scrabble other = (Scrabble) o;

        // get the letters from this
        char[] this_letters = getLetters().toCharArray();
        // get letters from other
        char[] other_letters = other.getLetters().toCharArray();

        return Arrays.equals(this_letters, other_letters);
    }

    public static void main(String[] args) {
        Tile[] t1 = {new Tile('A'), new Tile('A'), new Tile('H'), new Tile('D'), new Tile('E'), new Tile('F'), new Tile('G')};
        Tile[] t2 = {new Tile('A'), new Tile('A'), new Tile('H'), new Tile('D'), new Tile('E'), new Tile('G'), new Tile('F')};
        Scrabble s1 = new Scrabble(t1);
        Scrabble s2 = new Scrabble(t2);
        System.out.println(s1.getWords());
        System.out.println(Arrays.toString(s1.getScores()));
        System.out.println(s1.equals(s2));
    }
}
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class GameCharacter implements Serializable {
    private String name;
    private int level;
    private int health;
    private ArrayList<String> inventory;

    public GameCharacter(String name, int level, int health, ArrayList<String> inventory) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", inventory=" + inventory +
                '}';
    }

    public static void saveToFile(GameCharacter character, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(character);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GameCharacter loadFromFile(String fileName) {
        try (FileInputStream fileIn = new FileInputStream(fileName);
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
            GameCharacter character = (GameCharacter) in.readObject();
            return character;
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("GameCharacter class not found");
            c.printStackTrace();
        }
        return null;
    }
}
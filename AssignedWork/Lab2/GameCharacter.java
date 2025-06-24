import java.util.ArrayList;

public class GameCharacter {
    private int health = 50;
    private ArrayList<String> inventory = new ArrayList<>();

    public GameCharacter() {
        inventory.add("Potion");
        inventory.add("ThrowingStar");
    }

    public void attack() throws HealthDepletionException {
        health -= 10;
        if (health <= 0) {
            throw new HealthDepletionException("Character's health has depleted!");
        } else {
            System.out.println("Character attacks! Health is now: " + health + ".");
        }

    }

    public void useItem(String item) throws ItemNotFoundException {
        if (!inventory.contains(item)) {
            throw new ItemNotFoundException("Item not found in character's inventory!");
        }
        inventory.remove(item);
        System.out.println("Character used: " + item + ".");
    }
}

// public class AdventureGame {
//     public static void main(String[] args) {
//         GameCharacter character = new GameCharacter();
//         try {
//             character.attack();
//             character.attack();
//             character.attack();
//             character.attack();
//             character.attack();
//             character.attack(); // this should trigger a HealthDepletionException

//         } catch (HealthDepletionException e) {
//             System.out.println(e.getMessage());
//         }
//         try {
//             character.useItem("Branch"); // this should trigger a ItemNotFoundException
//         } catch (ItemNotFoundException e) {
//             System.out.println(e.getMessage());
//         }

//     }
// }

public class AdventureGame {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();

        character.attack();
        character.attack();
        character.attack();
        character.attack();
        character.attack();
        character.attack(); // this should trigger a HealthDepletionException

        character.useItem("Branch"); // this should trigger a ItemNotFoundException
    }
}

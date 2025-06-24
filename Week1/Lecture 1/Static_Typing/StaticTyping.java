public class StaticTyping {
    public static void main(String[] args) {
        // we need to define the type of our variable
        int a = 3;
        
        // we can change the value to something else, but it must be an integer
        a = 10;

        // uncomment the following and see what happens when we try to change the value of our variable to a String
        a = "Hello";
    }
}

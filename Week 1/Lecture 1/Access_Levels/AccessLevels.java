public class AccessLevels {
    int a = 10;

    // run this the first time with the access modifier set to 'public', and another
    // time with it set to 'private' - see the difference?
    private int getValueOfa() {
        return this.a;
    }
}
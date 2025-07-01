public class UserAccount {
    private static int instanceCount = 0;
    private int userId;
    private String username;

    public UserAccount(String username) {
        this.username = username;
        this.userId = instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }
}
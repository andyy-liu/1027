public class AgeVerification {
    private String name;
    private int age;

    public AgeVerification(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void verifyAge(int requiredAge) throws UnderageException {
        if (age < requiredAge) {
            throw new UnderageException("Your age (" + age + ") is less than the requiredAge (" + requiredAge + ").");
        } else {
            System.out.println("Approved for age requirement: " + requiredAge);
        }
    }

    public static void main(String[] args) {
        AgeVerification age1 = new AgeVerification("andy", 19);
        try {
            age1.verifyAge(18);
            age1.verifyAge(19);
            age1.verifyAge(20);
        } catch (UnderageException e) {
            System.out.println(e.getMessage());
        }
    }
}
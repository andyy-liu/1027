public class UtilityMethodsTests {
    private static int testsRun = 0;
    private static int testsPassed = 0;

    public static void main(String[] args) {

        UtilityMethods util = new UtilityMethods();

        // Test 3 methods
        testIsPrime(util);
        testSumArray(util);
        testIsPalindrome(util);

        // Print summary
        System.out.println("\n=== Test Summary ===");
        System.out.println("Tests Run: " + testsRun);
        System.out.println("Tests Passed: " + testsPassed);
        System.out.println("Tests Failed: " + (testsRun - testsPassed));
    }

    private static void runTest(String testName, boolean condition) {
        testsRun++;
        if (condition) {
            testsPassed++;
            System.out.println("[PASS] " + testName);
        } else {
            System.out.println("[FAIL] " + testName);
        }
    }

    private static void testIsPrime(UtilityMethods util) {
        System.out.println("Testing isPrime:");
        runTest("isPrime(7) should return true", util.isPrime(7) == true);
        runTest("isPrime(4) should return false", util.isPrime(4) == false);
        runTest("isPrime(1) should return false (edge case)", util.isPrime(1) == false);
        runTest("isPrime(2) should return true (smallest prime)", util.isPrime(2) == true);
        System.out.println();
    }

    private static void testSumArray(UtilityMethods util) {
        System.out.println("Testing sumArray:");
        runTest("sumArray([1,2,3]) should return 6",
                util.sumArray(new int[] { 1, 2, 3 }) == 6);
        runTest("sumArray([]) should return 0 (empty array)",
                util.sumArray(new int[] {}) == 0);
        runTest("sumArray([-5,5]) should return 0 (negatives)",
                util.sumArray(new int[] { -5, 5 }) == 0);
        System.out.println();
    }

    private static void testIsPalindrome(UtilityMethods util) {
        System.out.println("Testing isPalindrome:");
        runTest("isPalindrome('racecar') should return true",
                util.isPalindrome("racecar") == true);
        runTest("isPalindrome('hello') should return false",
                util.isPalindrome("hello") == false);
        runTest("isPalindrome('') should return true (empty string)",
                util.isPalindrome("") == true);
        runTest("isPalindrome('A man a plan a canal Panama') should handle spaces",
                util.isPalindrome("A man a plan a canal Panama") == true);
        System.out.println();
    }
}
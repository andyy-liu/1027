import java.util.Stack;

public class BrowserNavigation {
    private Stack<String> currentPageStack;
    private Stack<String> forwardStack;
    private String currentPage;

    public BrowserNavigation() {
        currentPageStack = new Stack<>();
        forwardStack = new Stack<>();
    }

    // visit a new page
    public void visit(String url) {
        currentPageStack.push(url);
        forwardStack.clear(); // clear forward stack when a new page is visited
    }

    // go back to the previous page
    public String back() {
        if (currentPageStack.isEmpty()) {
            return "No previous pages";
        }
        forwardStack.push(currentPageStack.pop());
        return getCurrentPage();
    }

    // go forward to the next page
    public String forward() {
        if (forwardStack.size() <= 1) {
            return "No forward pages";
        }
        currentPageStack.push(forwardStack.pop());
        return getCurrentPage();
    }

    // get the current page
    public String getCurrentPage() {
        if (currentPageStack.isEmpty()) {
            return "No pages visited";
        }
        return currentPageStack.peek();
    }

    public static void main(String[] args) {
        BrowserNavigation browser = new BrowserNavigation();

        browser.visit("google.com");
        browser.visit("stackoverflow.com");
        browser.visit("github.com");

        System.out.println("Current Page: " + browser.getCurrentPage()); // output: github.com

        System.out.println("Back: " + browser.back()); // output: stackoverflow.com
        System.out.println("Back: " + browser.back()); // output: google.com

        System.out.println("Forward: " + browser.forward()); // output: stackoverflow.com
        System.out.println("Visit new page");
        browser.visit("oracle.com");
        System.out.println("Current Page: " + browser.getCurrentPage()); // output: oracle.com

        System.out.println("Forward: " + browser.forward()); // output: No forward pages
        System.out.println("Back: " + browser.back()); // output: stackoverflow.com
    }
}
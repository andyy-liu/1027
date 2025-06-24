import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private String name;

    public Library(String name) {
        this.books = new ArrayList<Book>();
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public int getBookCount(Book book) {
        int count = 0;
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.equals(book)) {
                count++;
            }
        }
        return count;
    }

    public String getLibraryName() {
        return this.name;
    }

}

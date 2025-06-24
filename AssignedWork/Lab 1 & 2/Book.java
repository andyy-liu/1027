public class Book {
    private String title;
    private String author;
    private int year;

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublicationYear() {
        return this.year;
    }

    public boolean equals(Book other) {
        if (this.title == other.title && this.author == other.author && this.year == other.year) {
            return true;
        }
        return false;
    }

    public String getBookInformation() {
        return "Book: " + this.title + ", Author: " + this.author + ", Year: " + this.year;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Hobbit", "JRR Tolkien", 1937);
        System.out.println(book1.getBookInformation());
    }
}

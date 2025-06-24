public class Main {
    public static void main(String[] args) {
        // Create a new book
        Book book1 = new Book("The Hobbit", "JRR Tolkien", 1937);
        System.out.println(book1.getBookInformation());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Publication Year: " + book1.getPublicationYear());

        // Create a library and add the book to it
        Library library = new Library("City Library");
        library.addBook(book1);

        // Check the book count in the library
        int count = library.getBookCount(book1);
        System.out.println("Number of copies of '" + book1.getTitle() + "': " + count);
    }
}

public class Book {
    private String title;
    private String author;
    private String isbn;
    public static int totalBooks = 0;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    public static void displayTotalBooks() {
        System.out.println("Total books: " + totalBooks);
    }

    public static void main(String[] args) {
        Book Merah = new Book("IDK", "Andre", "1278");
        Book Biru = new Book("KDI", "Alfre", "0812");
        Book Hijau = new Book("DKI", "Pangestu", "1762");

        displayTotalBooks();
    }
}

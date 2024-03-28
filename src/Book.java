
public class Book implements Comparable<Book> {
    private String bookName, authorName;
    private int bookPage, relaseDateOfBook;

    public Book(String bookName, String authorName, int bookPage, int relaseDateOfBook) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookPage = bookPage;
        this.relaseDateOfBook = relaseDateOfBook;
    }

    @Override
    public int compareTo(Book o) {
        return o.getBookName().compareTo(getBookName());
    }


    public int getRelaseDateOfBook() {
        return relaseDateOfBook;
    }

    public void setRelaseDateOfBook(int relaseDateOfBook) {
        this.relaseDateOfBook = relaseDateOfBook;
    }

    public int getBookPage() {
        return bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}


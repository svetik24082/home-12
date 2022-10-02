import java.util.Objects;

public class Book {
    private final String bookName;
    private int yearRelease;
    private final Author author;

    public Book(String bookName, int yearRelease, Author author) {
        this.bookName = bookName;
        this.yearRelease = yearRelease;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    @Override
    public String toString() {
        return "Книга : " + this.bookName + " , автор : " + this.author+ " , год публикации : " + this.yearRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Book book = (Book) o;
        return yearRelease == book.yearRelease && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, yearRelease, author);
    }
}



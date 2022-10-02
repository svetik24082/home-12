public class Main {
    public static void main(String[] args) {

        Author author = new Author("Иван", "Тургенев");
        Book book = new Book("Отцы и дети",1988, author);
        Author author1 = new Author("Максим", "Горький");
        Book book1 = new Book("На дне", 1985, author1);
        System.out.println( book);
        System.out.println( book1);
        book.setYearRelease( 1960);
        System.out.println( book.getYearRelease() + " год предыдущий публикации");

    }
}
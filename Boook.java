public class Boook {
    String title;
    String author;
    int pages;

    public Boook(String bookTitle, String bookAuthor, int bookPages) {
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
    }

    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
    public static void main(String[] args) {
        Boook myBook = new Boook("Java Basics", "John Doe", 300);
        myBook.showDetails();
    }

}
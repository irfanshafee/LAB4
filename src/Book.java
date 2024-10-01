import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int pages;
    private LocalDate dateRead;


    public Book(String title, String author, String genre, int pages, LocalDate dateRead) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.dateRead = dateRead;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public int getPages() { return pages; }
    public LocalDate getDateRead() { return dateRead; }
}

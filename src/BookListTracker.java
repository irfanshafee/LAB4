import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class BookListTracker {
    private List<Book> books;

    public void loadBooks(String source, String format) {
        BookReader reader = BookReaderFactory.getBookReader(format);
        books = reader.readBooks(source);
    }

    public long totalBooksLastYear() {
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        return books.stream().filter(b -> b.getDateRead().isAfter(oneYearAgo)).count();
    }

    public Map<String, Long> booksPerMonth() {
        return books.stream()
                .collect(Collectors.groupingBy(b -> b.getDateRead().getMonth().toString(), Collectors.counting()));
    }

    public List<Book> topLongestBooks(int count) {
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getPages).reversed())
                .limit(count)
                .collect(Collectors.toList());
    }

    public String mostFrequentGenre() {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getGenre, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();
    }

    public double averageBookLength() {
        return books.stream().mapToInt(Book::getPages).average().orElse(0);
    }
}

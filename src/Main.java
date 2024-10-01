public class Main {
    public static void main(String[] args) {
        BookListTracker tracker = new BookListTracker();
        tracker.loadBooks("path/to/books.json", "json"); // or "csv" or "xml"

        System.out.println("Total books read in the last year: " + tracker.totalBooksLastYear());
        System.out.println("Books read per month: " + tracker.booksPerMonth());
        System.out.println("Top 10 longest books: " + tracker.topLongestBooks(10));
        System.out.println("Most frequent genre: " + tracker.mostFrequentGenre());
        System.out.println("Average book length: " + tracker.averageBookLength());
    }
}

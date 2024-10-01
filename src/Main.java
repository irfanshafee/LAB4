public class Main {
    public static void main(String[] args) {
        BookListTracker tracker = new BookListTracker();
        // tracker.loadBooks("C://Users//irfan//Desktop//OOC-2 lab//LAB - 4//Lab4//Book.xml", "xml");
        //tracker.loadBooks("C://Users//irfan//Desktop//OOC-2 lab//LAB - 4//Lab4//Books.csv", "csv");
         tracker.loadBooks("C://Users//irfan//Desktop//OOC-2 lab//LAB - 4//Lab4//Book.json", "json");

        System.out.println("Total books read in the last year: " + tracker.totalBooksLastYear());
        System.out.println("Books read per month: " + tracker.booksPerMonth());
        System.out.println("Top 10 longest books: " + tracker.topLongestBooks(10));
        System.out.println("Most frequent genre: " + tracker.mostFrequentGenre());
        System.out.println("Average book length: " + tracker.averageBookLength());
    }
}
